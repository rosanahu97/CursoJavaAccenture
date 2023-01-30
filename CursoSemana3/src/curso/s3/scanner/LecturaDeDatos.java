package curso.s3.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LecturaDeDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		int n1,n2;
		System.out.println("Introduce un numero: ");
		n1 = teclado.nextInt();
		//limpiar lo que hay en buffer
		teclado.nextLine();
		System.out.println("Introduce otro numero: ");
		n2=teclado.nextInt();
		teclado.nextLine();
		System.out.format("El primero numero introducido es %d y el segundo es %d ",n1,n2);
		
		

		
		
		
		

	}

}
