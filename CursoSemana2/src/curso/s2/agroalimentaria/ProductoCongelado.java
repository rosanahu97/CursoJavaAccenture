package curso.s2.agroalimentaria;

public class ProductoCongelado extends Producto{
	private double temperatura;

	/**
	 * 
	 * @param fechaC fecha de caducidad
	 * @param nLote numero de lote
	 * @param tp temperatura

	 * 
	 * 
	 * */
	
	public ProductoCongelado(String fechaC,int nLote,double tp) {
		super();
		this.setFechaCad(fechaC);
		this.setNumLote(nLote);
		this.setTemperatura(tp);
	}

	
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


	@Override
	public String toString() {
		return super.toString()+" con temperatura:"+this.getTemperatura();
	}
	
	
	
	
}
