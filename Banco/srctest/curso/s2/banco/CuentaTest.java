package curso.s2.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import curso.s2.banco.exceptions.ErrorFiltroException;
import curso.s2.banco.exceptions.SaldoIncorrectoException;
import curso.s2.banco.util.Filtros;
import curso.s2.banco.util.FiltroCastellano;

class CuentaTest {

	final String CONCEPTO_ERROR = "E";
	final double INGRESO_NEG = -1000.0;
	final String TITULAR_AUX = "Cliente aux de la prueba";
	final String TITULAR_ERROR = "H";
	private Cuenta cuenta;
	final String NCUENTA = "ES333222111000";
	final String NCUENTA_AUX = "ES333222111999";
	final String TCUENTA = "Cliente 1 de la prueba";
	final String CONCEPTO = "INGRESO A LA CUENTA";
	final double INGRESO1 =1000.0;
	final double INGRESO2 = 500.0;
	final double RETIRAR_ERROR = -2000;
	final double RETIRAR =50;
	private Filtros filtro;
	
	@BeforeEach
	
	void inicio() {
		filtro = new FiltroCastellano();
		cuenta = new Cuenta(NCUENTA, TCUENTA,filtro);
	}
		
	@Test
	void testCuenta() {
		Assertions.assertThrows(ErrorFiltroException.class,
				()-> new Cuenta(NCUENTA,TITULAR_ERROR,filtro));
	}

	@Test
	void testIngresarDoubleError() throws Exception {
		Assertions.assertThrows(SaldoIncorrectoException.class,
				()-> cuenta.ingresar(INGRESO_NEG));
	}

	
	@Test
	void testIngresarDouble() throws Exception {
		cuenta.ingresar(INGRESO1);
		Assertions.assertEquals(INGRESO1, cuenta.getSaldo());
	}
	
	@Test
	void testIngresarStringDouble() throws Exception {
		cuenta.ingresar(CONCEPTO, INGRESO1);
		Assertions.assertEquals(INGRESO1,cuenta.getSaldo() );

	}
	void testIngresarStringDoubleError() {
		Assertions.assertThrows(ErrorFiltroException.class,
				()-> cuenta.ingresar(CONCEPTO_ERROR, INGRESO1));
	}

	@Test
	void testRetirarDouble() throws Exception {
		cuenta.ingresar(INGRESO1);
		cuenta.retirar(RETIRAR);
		Assertions.assertEquals(INGRESO1-RETIRAR, cuenta.getSaldo());
		
	}
	@Test
	void testRetirarDoubleError() throws Exception {
		
		Assertions.assertThrows(SaldoIncorrectoException.class,
				()-> cuenta.retirar(RETIRAR_ERROR));
		
	}

	@Test
	void testRetirarStringDoubleError() throws Exception {
		
		Assertions.assertThrows(ErrorFiltroException.class,
				()-> cuenta.retirar(CONCEPTO_ERROR,RETIRAR));
	}


	

	@Test
	void testGetmNumero() {
		cuenta.setmNumero(NCUENTA_AUX);
		Assertions.assertEquals(NCUENTA_AUX, cuenta.getmNumero());
	}

	

	@Test
	void testGetmTitular() {
		cuenta.setmTitular(TITULAR_AUX);
		Assertions.assertEquals(TITULAR_AUX, cuenta.getmTitular());
	}

	

}
