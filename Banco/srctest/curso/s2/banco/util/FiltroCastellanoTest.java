package curso.s2.banco.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class FiltroCastellanoTest {
	final static String FECHA_CORRECTA="10-10-2020";
	final static String FECHA_CORRECTA2="10/10/2020";
	final static String FECHA_ERROR_1="09.09";
	final static String FECHA_ERROR_2="123456679";
	final static String[] FECHA_ARRAY= {"10-10-2020","10-11-2020","10-12-2020","22-10-2020","25-10-2020"};
	private Filtros filtro;	
	
	
	@BeforeEach
	void inicio() {
		filtro = new FiltroCastellano();
	}
	
	

	@Test
	void testValidarFechaLocalDateString() {

		Assertions.assertEquals(filtro.validarFecha(FECHA_CORRECTA, "dd-MM-yyyy"), LocalDate.of(2020,10,10));
	}
	@Test
	void testValidarFechaLocalDateStringBarra() {

		Assertions.assertEquals(filtro.validarFecha(FECHA_CORRECTA2, "dd/MM/yyyy"), LocalDate.of(2020,10,10));
	}
	
	
	@Test
	void testValidarFechaLocalDate() {
		Assertions.assertEquals(filtro.validarFecha(FECHA_CORRECTA), LocalDate.of(2020,10,10));

	}
	@Test
	void testValidarFechaLocalDateError1() {
		Assertions.assertEquals(filtro.validarFecha(FECHA_ERROR_1),null);
	}
	
	@Test
	void testValidarFechaLocalDateError2() {
		Assertions.assertEquals(filtro.validarFecha(FECHA_ERROR_2),null);
	}
	@RepeatedTest(value = 5 , name = "Custom name {currentRepetition}/{totalRepetitions}")
	void testValidarFechaLocalDateArray(RepetitionInfo info) {	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Assertions.assertEquals(filtro.validarFecha(FECHA_ARRAY[info.getCurrentRepetition()-1]),LocalDate.parse(FECHA_ARRAY[info.getCurrentRepetition()-1],dtf));
	}
	

}
