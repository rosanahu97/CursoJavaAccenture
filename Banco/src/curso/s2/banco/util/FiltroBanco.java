package curso.s2.banco.util;

import curso.s2.banco.exceptions.ErrorFiltroException;
import curso.s2.banco.exceptions.SaldoIncorrectoException;

public class FiltroBanco {

		final static int L_MIN =10;
		final static int L_MAX =100;
	
	
	public static boolean comprobarParametros(String concepto,double x) {
		if(x<=0) {
			throw new SaldoIncorrectoException("Error, no se puede ingresar valor negativo");
		}
		if(!Filtro.validarConcepto(concepto,L_MIN,L_MAX)) {
			throw new ErrorFiltroException("Error, el concepto debe esta comprendido entre 10 y 100 caracteres");
		}
	
		return true;
	}
}
