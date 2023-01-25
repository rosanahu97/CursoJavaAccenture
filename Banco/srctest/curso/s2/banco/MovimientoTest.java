package curso.s2.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	final String CONCEPTO = "Este es un mensaje de prueba";
	final double IMPORTE_1 = 20; 
	Movimiento mov;
	
	
	
	@BeforeEach
	void inicio() {
		mov= new Movimiento();
	}
	
	
	
	@Test
	void testGetmConcepto() {
		mov.setmConcepto(CONCEPTO);
		assertEquals(CONCEPTO,mov.getmConcepto());
	}

	
	

	@Test
	void testGetmFecha() {
		LocalDate fecha = LocalDate.now();
		mov.setmFecha(fecha);
		assertEquals(fecha,mov.getmFecha());
	}

	@Test
	void testGetmImporte() {
		mov.setmImporte(IMPORTE_1);
		assertEquals(IMPORTE_1,mov.getmImporte());
	}

	

}
