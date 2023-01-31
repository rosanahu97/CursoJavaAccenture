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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		nMaquina = rn.nextInt(topeSup);
		int rMaquina ;
		//mientras el numero introducido no es correcto, se repite el bucle
			while(!finJuego) {

				rMaquina =getRandomNumberInRange(topeInf,topeSup);			
		System.out.println("Numero: "+ rMaquina);
		System.out.println("M=Mayor, m = Menor, f= Fin");
				String miRespuesta = sc.next();
				switch(miRespuesta){		
				case "M": rMaquina =getRandomNumberInRange(topeInf, rMaquina);break;
				case "m": rMaquina =getRandomNumberInRange(rMaquina,topeSup);break;
				case "f": finPartido = true;
						  finJuego = true;
							System.out.println("Numero correcto!!!");	break;
				}			
				if(!finPartido) {
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

		}


	}
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
