package curso.s2.herencia.agroalimentaria;

public class CongeladoPorNitrogeno extends ProductoCongelado{
	private String metodoCong;
	private int tiempo;
	
	/**
	 * 
	 * @param fechaC fecha de caducidad
	 * @param nLote numero de lote
	 * @param tp temperatura
	 * @param m el metodo utilizado
	 * @param tiempo el tiempo dedicado
	 * 
	 * 
	 * */
	
	public CongeladoPorNitrogeno(String fechaC,int nLote,double tp,String m,int tiempo) {
		super(fechaC, nLote, tp);
		this.setMetodoCong(m);
		this.setTiempo(tiempo);
	}

	public String getMetodoCong() {
		return metodoCong;
	}

	public void setMetodoCong(String metodoCong) {
		this.metodoCong = metodoCong;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Producto congelado por nitrogeno: "+super.toString()+" , metodoCong=" + metodoCong + ", tiempo=" + tiempo ;
	}
	
	

	
}
