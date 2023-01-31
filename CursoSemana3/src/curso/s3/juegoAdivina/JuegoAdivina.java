package curso.s3.juegoAdivina;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivina {

	public static void main(String[] args) {
		boolean acertado = false;
		Random rn = new Random();
		int numero =rn.nextInt(100);
		Scanner sc = new Scanner(System.in);
		//mientras el numero introducido no es correcto, se repite el bucle
			while(!acertado) {
		System.out.println("Introduce un numero: ");
				int res = sc.nextInt();
				if(res==numero) {
					System.out.println("Numero correcto!!!");	
					//sale del bucle
					acertado = true;
				}else if(res>numero) {
				System.out.println("El numero correcto es menor que "+res);

				}else {
				System.out.println("El numero correcto es mayor que "+res);

				}
		}

	}

}
