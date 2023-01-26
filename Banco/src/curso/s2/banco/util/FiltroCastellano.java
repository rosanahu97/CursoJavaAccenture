package curso.s2.banco.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FiltroCastellano implements Filtros{

	@Override
	public LocalDate validarFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return validarFecha(fecha,"dd-MM-yyyy");
	}

	@Override
	public LocalDate validarFecha(LocalDate fecha, String formato) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
		String fcorrecta = fecha.format(dtf);
		String fentrada = fecha.toString();
		if(fentrada.compareTo(fcorrecta) ==0) {
			return fecha;
		}
		return null;
	}

	
}
