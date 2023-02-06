package rf.ficheros.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MontadorSQLTest {
	final String NOMBRE_CAMPO ="nombreCampo";
	final String NOMBRE_CAMPO_VACIO="";
	final int VALOR_INT =20;
	final long VALOR_LONG =12345;
	final double VALOR_DOUBLE =123.45;
	final String VALOR_STRING ="texto en cadena";
	final String SALIDA_NOMBRECAMPO_VACIO_INT="20";
	final String SALIDA_INT ="nombreCampo=20";
	final String SALIDA_LONG ="nombreCampo=12345";
	final String SALIDA_DOUBLE="nombreCampo=123.45";
	final String SALIDA_STRING ="nombreCampo='texto en cadena'";
	final String SALIDA_LARGA ="nombreCampo=20, nombreCampo=123.45";
	final String SALIDA_LARGA_2 ="nombreCampo=20, nombreCampo=123.45, nombreCampo='texto en cadena'";

	
	@Test
	public void testAddSalidanNombreCampoVacio() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO_VACIO,VALOR_INT,",");
		assertEquals(SALIDA_NOMBRECAMPO_VACIO_INT,salida);
	}
	
	
	
	
	@Test
	public void testAddSalidaStringStringIntString() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		assertEquals(SALIDA_INT,salida);
	}
	@Test
	public void testAddSalidaStringStringLongString() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_LONG,",");
		assertEquals(SALIDA_LONG,salida);
	}
	@Test
	public void testAddSalidaStringStringDoubleString() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_DOUBLE,",");
		assertEquals(SALIDA_DOUBLE,salida);
	}
	@Test
	public void testAddSalidaStringStringStringString() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_STRING,",");
		assertEquals(SALIDA_STRING,salida);
	}

	@Test
	public void testAddSalidaLargo() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_DOUBLE,",");
		assertEquals(SALIDA_LARGA,salida);
	}
	@Test
	public void testAddSalidaLargo_2() {
		String salida ="";
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_DOUBLE,",");
		salida=MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_STRING,",");
		assertEquals(SALIDA_LARGA_2,salida);
	}
}
