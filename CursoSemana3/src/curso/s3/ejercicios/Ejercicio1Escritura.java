package curso.s3.ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ejercicio1Escritura {

	public static void main(String[] args) {
		//leer los datos del fichero y imprimirlo por la consola
				File fich = new File("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\nombreApellido.txt");
				try(Scanner leerFichero = new Scanner(fich)){
					leerFichero.useDelimiter("\n");
					StringJoiner sj = new StringJoiner(" ");
					while(leerFichero.hasNext()) {
						String cadena  = leerFichero.next().trim();
						String[] partes=cadena.split("=");
						sj.add(partes[1].toString());	
						
					}
					System.out.println(sj.toString());
			}catch(IOException e) {
					e.printStackTrace();
				}


	}

}
