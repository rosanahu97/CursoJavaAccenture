package curso.s3.juegoAdivina;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivina2 {
		static int miNumero;
		static boolean finJuego=false;
		static boolean finPartido=false;
		static int topeSup =1000;
		static int topeInf =0;
		static int nMaquina;
		static int rMaquina;
		static Scanner sc;
	public static void main(String[] args) {
		 sc= new Scanner(System.in);
		Random rn = new Random();
		nMaquina = rn.nextInt(topeSup);
		rMaquina =getRandomNumberInRange(topeInf,topeSup);			
		//mientras el numero introducido no es correcto, se repite el bucle
			
		while(!finJuego) {
					juegaMaquina();
					
				if(!finPartido && !finJuego) {
					juegoPartido();
				}
		}

	}
	private static void juegaMaquina() {
		System.out.println("Numero: "+ rMaquina);
		System.out.println("M=El numero correcto es mayor, m = El numero correcto es  menor, f= Fin");
				String miRespuesta = sc.next();
				switch(miRespuesta){		
				case "M": 	topeInf = rMaquina;
							rMaquina =getRandomNumberInRange(topeInf,topeSup);break;
				case "m": 	topeSup = rMaquina;
							rMaquina =getRandomNumberInRange(topeInf,topeSup);break;
				case "f": finPartido = true;
						  finJuego = true;
							System.out.println("Numero correcto!!!");	break;
				}		
	}
	private static void juegoPartido() {
		System.out.println("Introduce un numero:");
		miNumero = sc.nextInt();
		if(miNumero==nMaquina) {
			System.out.println("Numero correcto!!!");	
			//sale del bucle
			finJuego = true;
		}else if(miNumero>nMaquina) {
		System.out.println("El numero correcto es menor que "+miNumero);

		}else {
		System.out.println("El numero correcto es mayor que "+miNumero);

		}
	}
	
	
	private static int getRandomNumberInRange(int min, int max) {
		//System.out.println("valor min y max:"+min+" "+max);
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
