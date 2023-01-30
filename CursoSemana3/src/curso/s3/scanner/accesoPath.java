package curso.s3.scanner;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class accesoPath {

	public static void main(String[] args) throws IOException {
		Path pa = Paths.get("C:\\Users\\yuqian.hu\\OneDrive - Accenture\\Documents\\Prueba1.txt");
		System.out.println(pa);
		System.out.println("File name: "+pa.getFileName());
		System.out.println("Name: "+pa.getName(0));
		System.out.println("Name Count:"+pa.getNameCount());
		System.out.println("Subpath:" +pa.subpath(0, 1));
		System.out.println("Parent: "+pa.getParent());
		System.out.println("Root: "+pa.getRoot());
		System.out.println("Real path: "+pa.toRealPath());
		System.out.println("To file:"+pa.toFile());
		System.out.println("Normalize"+pa.normalize());
		System.out.println("Compare to:"+pa.compareTo(pa));
		System.out.println("endWith"+pa.endsWith(pa));
		System.out.println("endWith"+pa.endsWith("Documents"));

	}

}
