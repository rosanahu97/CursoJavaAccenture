package curso.s3.scanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copiaMoverFichero {

	public static void main(String[] args) throws IOException {
		//copiar un fichero en otro con opcion reemplazar todos
		Path path1 = Paths.get("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\Prueba1.txt");
		Path path2 = Paths.get("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\CopiaPrueba1.txt");
		Path target = Files.copy(path1, path2,StandardCopyOption.REPLACE_EXISTING);
		System.out.println(target.getFileName());
		
		
		//mover un fichero con opcion reemplazar todos
		//borra el fichero origen y copia su contenido en movido
		Path origen = Paths.get("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\Prueba1.txt");
		Path destino = Paths.get("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\movido.txt");
		Path targetMover = Files.move(origen, destino,StandardCopyOption.REPLACE_EXISTING);
		System.out.println(targetMover.getFileName());
		
	}

}
