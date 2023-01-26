package curso.s2.banco.util;

import java.time.LocalDate;

public class FiltroEEUU implements Filtros{

	@Override
	public LocalDate validarFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return validarFecha(fecha,"yyyy-MM-dd");
	}

	@Override
	public LocalDate validarFecha(LocalDate fecha, String formato) {
		LocalDate fe = LocalDate.now();
		return fe;
	}

	
}
