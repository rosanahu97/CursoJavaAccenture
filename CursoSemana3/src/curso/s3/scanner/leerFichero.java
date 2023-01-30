package curso.s3.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class leerFichero {

	public static void main(String[] args) {
		
		File fichero = new File("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\Curso2023\\CursoJavaAccenture-Yuqian\\.gitignore");
		try(Scanner leerFichero = new Scanner(fichero)){
			leerFichero.useDelimiter("\n");
			while(leerFichero.hasNext()) {
				String cadena  = leerFichero.next();
				System.out.print(cadena+" ");
			}
	}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
