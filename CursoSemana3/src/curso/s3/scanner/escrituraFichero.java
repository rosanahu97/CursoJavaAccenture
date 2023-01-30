package curso.s3.scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class escrituraFichero {

	public static void main(String[] args) {
		//crear los writers
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			//crear el fichero 
			fichero = new FileWriter("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\Prueba1.txt");
			pw = new PrintWriter(fichero);
			for(int i =0;i<10;i++) {
				//escribir en fichero 
				pw.println("Linea"+i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//cierra el fichero en caso no nulo
			try {
				if (fichero!=null) {
					fichero.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
