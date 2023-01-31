package curso.s3.juegoAdivina;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivina2 {
	static int miNumero;
	static boolean finJuego = false;
	static boolean finPartido = false;
	static int puntoUsuario =0;
	static int puntoMaquina=0;
	static int topeSup = 1000;
	static int topeInf = 0;
	static int nMaquina;
	static int rMaquina;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Random rn = new Random();
		nMaquina = rn.nextInt(topeSup);
		rMaquina = rn.nextInt(topeSup);
		// mientras el numero introducido no es correcto, se repite el bucle

		while (!finJuego) {

			juegaMaquina();

			if (!finPartido && !finJuego) {
				juegoPartido();
			}
		//pregunta al usuario si quiere jugar otro partido o no
			if(finPartido) {
			System.out.println("Quieres jugar otro partido ?? S/N");
			String respuesta =sc.next();
			sc.nextLine();
			//en caso negativo, se acaba el partido
			if(respuesta.equals("N")) {
				finJuego = true;
				ganador();
				System.out.println("Juego terminado");
			}else {
				//en caso positivo, restablecer los valores
				topeSup = 1000;
				topeInf = 0;
				nMaquina = rn.nextInt(topeSup);
				rMaquina = rn.nextInt(topeSup);
				finPartido = false;
				System.out.println("Partido nuevo");
			}
		}
		}
		

	}

	private static void ganador() {
		if(puntoUsuario == puntoMaquina) {
			System.out.println("Empate!!!");
		}else if (puntoUsuario > puntoMaquina) {
			System.out.println("El usuario ha ganado!!!");

		}else {
			System.out.println("La maquina ha ganado!!!");

		}
		
	}

	private static void juegaMaquina() {
		System.out.println("Numero: " + rMaquina);
		System.out.println("M=El numero correcto es mayor, m = El numero correcto es  menor, f= Fin");
		String miRespuesta = sc.next();
		sc.nextLine();
		//comprueba la respuesta del usuario
		switch (miRespuesta) {
		case "M":
			topeInf = rMaquina;
			rMaquina = (topeInf+topeSup)/2;
			break;
		case "m":
			topeSup = rMaquina;
			rMaquina = (topeInf+topeSup)/2;
			break;
		case "f":
			finPartido = true;
			puntoMaquina++;
			System.out.println("Numero correcto!!!");
			break;
		}
	}

	private static void juegoPartido() {
		System.out.println("Introduce un numero:");
		miNumero = sc.nextInt();
		sc.nextLine();
		if (miNumero == nMaquina) {
			puntoUsuario++;
			System.out.println("Numero correcto!!!");
			// sale del bucle
			finPartido = true;
		} else if (miNumero > nMaquina) {
			System.out.println("El numero correcto es menor que " + miNumero);

		} else {
			System.out.println("El numero correcto es mayor que " + miNumero);

		}
	}

}
