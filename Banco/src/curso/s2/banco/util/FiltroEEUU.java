package curso.s2.banco.util;

import java.time.LocalDate;

public class FiltroEEUU implements Filtros{

	@Override
	public LocalDate validarFecha(String fecha) {
		// TODO Auto-generated method stub
		return validarFecha(fecha,"yyyy-MM-dd");
	}

	
}
