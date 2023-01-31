package curso.s3.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ejercicio1Lectura {

	public static void main(String[] args) {
		String nombre ="";
		String apellido ="";
		//leer los datos del fichero y imprimirlo por la consola
		File fich = new File("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\nombreApellido.txt");
		try(Scanner leerFichero = new Scanner(fich)){
			leerFichero.useDelimiter("\n");
			while(leerFichero.hasNext()) {
				String cadena[]  = leerFichero.next().trim().split("=");
				if(cadena[0].equals("Nombre")) {
					nombre = cadena[1];
				}
				if(cadena[0].equals("Apellido")) {
					apellido = cadena[1];
				}
			}
			System.out.println(nombre+" "+apellido);
	}catch(IOException e) {
			e.printStackTrace();
		}


		
	
}
}
