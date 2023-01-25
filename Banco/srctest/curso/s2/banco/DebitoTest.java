package curso.s2.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {
	private Tarjeta tarjeta;
	private LocalDate mFechaDeCaducidad; 
	final String mNumero ="ES123456789"; 
	final String mTitular = "Tarjeta debito del cliente1";
	final double INGRESO1 = 1000.0;
	final double RETIRAR1 =500.0;
	final double PAGO1 =20;
	
	@BeforeEach
	
	void inicio() {
		tarjeta = new Debito(mFechaDeCaducidad,mNumero,mTitular);
	}
	
	@Test
	void testGetSaldo() throws Exception {
		tarjeta.ingresar(INGRESO1);
		Assertions.assertEquals(INGRESO1, tarjeta.getSaldo());
	}

	@Test
	void testIngresar() {
		fail("Not yet implemented");
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirar() {
		fail("Not yet implemented");
	}

	@Test
	void testDebito() {
		fail("Not yet implemented");
	}

}
