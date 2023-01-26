package curso.s2.banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import curso.s2.banco.exceptions.SaldoIncorrectoException;

public class Credito extends Tarjeta {

	private final static double INTERES=0.05;
	private final static double MINIMO =3;
	private double mCredito;
	private List<Movimiento> mMovimiento;
	
	public Credito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);
		mMovimiento = new ArrayList<Movimiento>();
		mCredito = 500;
	}
	
	public double getCreditoDisponible() {
		return getmCredito()+getSaldo();
		
	}
	
	@Override
	public double getSaldo() {
		double res =0;
		for(Movimiento m : mMovimiento) {
			res +=m.getmImporte();
		}
		return res;
	}
	
	
	@Override
	public void ingresar(double x) {
		if(x<=0) {
			throw new SaldoIncorrectoException("Error, no se puede ingresar valor negativo");
		}
		Movimiento m = new Movimiento();
		m.setmImporte(x);
		m.setmConcepto("Ingreso en cuenta asociada(cajero automatico)");
		m.setmFecha(LocalDate.now());
		mMovimiento.add(m);
		
			
	}
	
	public void liquidar (int mes,int anyo) {
		//defino una lista auxiliar para guardar los movimientos del mes-anyo
		List<Movimiento> aux = new ArrayList<>();
		
		double importe =0;
		/*for(Movimiento m : mMovimiento) {
			LocalDate fecha = m.getmFecha();
			int month=fecha.getMonthValue();
			int year =fecha.getYear();
			if(month==mes && year ==anyo) {
				importe += m.getmImporte();
				aux.add(m);
			}		
		}*/
		
		importe = mMovimiento.stream()
		.filter(m->m.getmFecha().getYear()==anyo)
		.filter(m->m.getmFecha().getMonthValue()==mes)
		.mapToDouble(m->m.getmImporte())
		.sum();
		
		aux =	mMovimiento.stream()
				.filter(m->!(m.getmFecha().getYear()==anyo))
				.filter(m->!(m.getmFecha().getMonthValue()==mes))
				.collect(Collectors.toList());
	
		this.setmMovimiento(aux);
		
		//borro esos movimientos de la lista
		//mMovimiento.removeAll(aux);
		
		/*
		for(Iterator it = mMovimiento.iterator();it.hasNext();) {
			Movimiento m = (Movimiento)it.next();
			
			int month=m.getmFecha().getMonthValue();
			int year =m.getmFecha().getYear();
			if(month==mes && year ==anyo) {
				importe += m.getmImporte();
				it.remove();
			}
			
			
		}*/
		
		if(importe<0) {
			throw new SaldoIncorrectoException("Error, saldo negativo despues de la liquidacion ");
		}
		
		//añadir el movimiento a la lista de la clase cuenta
		
		getmCuentaAsociada().addMovimiento("Liquidacion a fecha de: "+LocalDate.now(),importe);
		
		
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		Movimiento m = new Movimiento();
		m.setmConcepto("Compra a credito en "+datos);
		m.setmFecha(LocalDate.now());
		m.setmImporte(-x);
		mMovimiento.add(m);
		
		
		
	}

	@Override
	public void retirar(double x) {
		if(x<=0) {
			throw new SaldoIncorrectoException("Error, no se puede retirar valor negativo");
		}
		Movimiento m = new Movimiento();
		m.setmConcepto("Retirada cuenta asociada(cajero automatico)");
		m.setmFecha(LocalDate.now());
		double comision =(x*INTERES/100);
		if(comision<MINIMO) {
			comision=MINIMO;
		}
		double retirada = x+comision;
		
		m.setmImporte(-retirada);
		mMovimiento.add(m);
		
		
	}

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public List<Movimiento> getmMovimiento() {
		return mMovimiento;
	}

	public void setmMovimiento(List<Movimiento> mMovimiento) {
		this.mMovimiento = mMovimiento;
	}
	
	


}
