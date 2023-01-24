package curso.s2.banco;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Debito extends Tarjeta{

	public Debito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSaldo() {
		
		return getmCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double x) throws Exception {

		getmCuentaAsociada().ingresar(x);
		
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		Movimiento m = new Movimiento();
		m.setmImporte(-x);
		m.setmConcepto("Compras con tarjeta debito en "+datos);
		m.setmFecha(LocalDate.now());
		getmCuentaAsociada().addMovimiento(m);
		
	}

	@Override
	public void retirar(double x) throws Exception {

		getmCuentaAsociada().retirar(x);
		
	}

}
