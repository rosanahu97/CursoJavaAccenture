package curso.s2.banco;
import java.time.LocalDate;
import java.time.LocalTime;


public class Movimiento {

	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	public String getmConcepto() {
		return mConcepto;
	}
	
	
	public Movimiento() {}
	

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}
	public LocalDate getmFecha() {
		return mFecha;
	}
	public void setmFecha(LocalDate localTime) {
		this.mFecha = localTime;
	}
	public double getmImporte() {
		return mImporte;
	}
	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}


	@Override
	public String toString() {

		return "Concepto:"+this.getmConcepto()+"\t"+"Fecha operacion: "+this.getmFecha()
				+"\t"+"Importe: "+this.getmImporte()+"\n";
	}
	
	
	
	
	
	
	
}
