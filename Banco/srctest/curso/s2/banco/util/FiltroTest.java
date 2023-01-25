package curso.s2.banco.util;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FiltroTest {

	final String TITULAR1 = "Este titular es de 21";
	final LocalDate FECHA1 = LocalDate.now().plusYears(2);
	final LocalDate FECHA2 = LocalDate.now().plusYears(6);
	final LocalDate FECHA3 = LocalDate.now();
	final LocalDate FECHA4 = LocalDate.now().plusYears(4);
	final String CONCEPTO = "Este es un mensaje";
	
	
	@Test
	void testValidarNombre() {
		System.out.println(TITULAR1+ "Con lenght max =20 ");
		assertFalse(Filtro.validarNombre(TITULAR1, 0, 20));	
	}
	
	@Test
	void testValidarNombre1() {
		System.out.println(TITULAR1+ "Con lenght max =25, min =22 ");
		assertFalse(Filtro.validarNombre(TITULAR1, 22, 25));	
	}
	@Test
	void testValidarNombre2() {
		System.out.println(TITULAR1+ "Con lenght max =22 ");
		assertFalse(Filtro.validarNombre(TITULAR1, 22, 25));	
	}
	
	@Test
	void testValidarNombre3() {
		System.out.println(TITULAR1+ "Con lenght max =22 ");
		assertTrue(Filtro.validarNombre(TITULAR1, 0, 25));	
	}
	
	
	@Test
	void testValidarFechaCad() {
		System.out.println(FECHA1.toString()+ " Fecha dos años despues ");

		assertFalse(Filtro.validarFechaCad(FECHA1));
	}
	
	@Test
	void testValidarFechaCad2() {
		System.out.println(FECHA2.toString()+ " Fecha seis años despues ");
		assertFalse(Filtro.validarFechaCad(FECHA2));
	}
	@Test
	void testValidarFechaCad3() {
		System.out.println(FECHA3.toString()+ " Fecha iguales");
		assertFalse(Filtro.validarFechaCad(FECHA3));
	}
	@Test
	void testValidarFechaCad4() {
		System.out.println(FECHA4.toString()+ " Fecha correcta ");
		assertTrue(Filtro.validarFechaCad(FECHA4));
	}
	
	@Test
	void testValidarFechaCad5() {
		System.out.println(" Fecha nula ");
		assertFalse(Filtro.validarFechaCad(null));
	}
	
	
	@Test
	void testValidarConcepto() {
		System.out.println(CONCEPTO + " Con length = 18, max= 50, min = 30");
		assertFalse(Filtro.validarConcepto(CONCEPTO, 30, 50));
		
	}
	@Test
	void testValidarConcepto1() {
		System.out.println(CONCEPTO + " Con length = 18, max= 15, min = 0");
		assertFalse(Filtro.validarConcepto(CONCEPTO, 0, 15));
		
	}
	@Test
	void testValidarConcepto2() {
		System.out.println(CONCEPTO + " Con length = 18, max= 20, min = 0");
		assertTrue(Filtro.validarConcepto(CONCEPTO, 0, 20));
		
	}

}
