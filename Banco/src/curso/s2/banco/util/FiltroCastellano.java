package curso.s2.banco.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FiltroCastellano implements Filtros{

	@Override
	public LocalDate validarFecha(String fecha) {
		// TODO Auto-generated method stub
		return validarFecha(fecha,"dd-MM-yyyy");
	}


	
}
