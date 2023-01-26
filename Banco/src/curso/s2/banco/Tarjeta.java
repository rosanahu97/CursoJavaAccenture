package curso.s2.banco;

import java.time.LocalDate;

import curso.s2.banco.exceptions.SaldoIncorrectoException;
import curso.s2.banco.exceptions.ErrorFiltroException;
import curso.s2.banco.util.FiltroCastellano;
import curso.s2.banco.util.Filtros;


public abstract class Tarjeta {
	
	private Cuenta mCuentaAsociada;
	private LocalDate mFechaDeCaducidad;
	private String mNumero;
	private String mTitular;
	private Filtros filtro;

	
	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		filtro = new FiltroCastellano();
		if(!filtro.validarFechaCad(mFechaDeCaducidad)) {
			throw new ErrorFiltroException("Error, fecha de caducidad incorrecta");
		}
		this.mFechaDeCaducidad = mFechaDeCaducidad;
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}
	
	public abstract double getSaldo();
	public abstract void ingresar(double x) throws Exception;
	public abstract void pagoEnEstablecimiento(String datos,double x);
	public abstract void retirar(double x) throws Exception;
	
	
	public void setCuenta(Cuenta c) {
		this.mCuentaAsociada=c;
	}

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}

	public LocalDate getmFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	public void setmFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		this.mFechaDeCaducidad = mFechaDeCaducidad;
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
	
	
}
