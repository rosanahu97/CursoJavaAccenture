package curso.s2.banco.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroCastellanoTest {
	final static String FECHA_CORRECTA="10-10-2020";
	final static String FECHA_CORRECTA2="10/09/2020";
	final static String FECHA_ERROR_1="09.09";
	final static String FECHA_ERROR_2="123456679";
	private Filtros filtro;	
	
	
	@BeforeEach
	void inicio() {
		filtro = new FiltroCastellano();
	}
	
	

	@Test
	void testValidarFechaLocalDateString() {
		LocalDate res =filtro.validarFecha(LocalDate.parse(FECHA_CORRECTA), "dd-MM-yyyy");
		Assertions.assertEquals(res, LocalDate.parse(FECHA_CORRECTA));
	}

}
