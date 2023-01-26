package curso.s2.optional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class Opcionales {
	
	public static void main(String[] args) {
		String name = null;
		Optional<String> nombre = Optional.ofNullable(name);
		//salta la excepcion nullPointer
		//System.out.println(name.length());
		
		nombre.ifPresent( n-> System.out.println(n.length()));

		
	}
}

