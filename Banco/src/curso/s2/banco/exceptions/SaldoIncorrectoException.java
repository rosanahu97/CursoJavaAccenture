package curso.s2.banco.exceptions;

public class SaldoIncorrectoException extends RuntimeException{

	public SaldoIncorrectoException() {
		super();
	}
	
	public SaldoIncorrectoException(String msg) {
		super(msg);
	}
}
