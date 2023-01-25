package curso.s2.banco;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import curso.s2.banco.exceptions.SaldoIncorrectoException;
import curso.s2.banco.exceptions.ErrorFiltroException;
import curso.s2.banco.util.Filtro;
import curso.s2.banco.util.FiltroBanco;

public class Cuenta {

	private List<Movimiento> mMovimientos;
	private String mNumero;
	private String mTitular;
	private final static int TITULO_MAX=30;
	private final static int TITULO_MIN=5;
	
	public Cuenta(String mNumero, String mTitular) {
		super();
		//Comprobar la longitud del parametro mTitular
		if(!Filtro.validarNombre(mTitular, TITULO_MIN, TITULO_MAX)) {
			throw new ErrorFiltroException("El longitud del nombre incorrecto");
		}
		mTitular = mTitular;
		mNumero = mNumero;
		mMovimientos = new ArrayList<Movimiento>();
	}
	
	public void addMovimiento(Movimiento m) {
		mMovimientos.add(m);
	}
	
	public void addMovimiento(String concepto,double x) {
		Movimiento m = new Movimiento();
		m.setmImporte(x);
		m.setmConcepto(concepto);
		m.setmFecha(LocalDate.now());
		addMovimiento(m);
	}
	
	
	public double getSaldo() {
		double res =0;
		for(Movimiento m : mMovimientos) {
			res +=m.getmImporte();
		}
		return res;
		
	}
	public void ingresar(double x) throws Exception {
		ingresar("Ingreso cuenta",x);
		
	}
	public void ingresar(String concepto,double x) throws Exception {
		if(FiltroBanco.comprobarParametros(concepto, x)) {
			addMovimiento(concepto,x);
		}
	}
	public void retirar (double x) throws Exception {
		retirar("Retirada cuenta",x);
	}
	public void retirar (String concepto,double x) throws Exception {
		if(FiltroBanco.comprobarParametros(concepto, x)) {
			addMovimiento(concepto,-x);
		}
		
		
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	@Override
	public String toString() {
		return "Cuenta: " + ", mNumero=" + mNumero + ", mTitular=" + mTitular +"\n"+ 
				mMovimientos.toString();
	}
	
	
}
