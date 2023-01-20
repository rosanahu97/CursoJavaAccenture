package curso.s2.agroalimentaria;

public class CongeladoPorAgua extends ProductoCongelado{
	private int salinidad;
	/**
	 * 
	 * @param fechaC fecha de caducidad
	 * @param nLote numero de lote
	 * @param tp temperatura
	 * @param s salinidad
	 * 
	 * 
	 * */
	public CongeladoPorAgua(String fechaC,int nLote, double tp,int s) {
		super(fechaC, nLote, tp);
		this.setSalinidad(s);
	}

	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}

	@Override
	public String toString() {
		return "Producto congalado por agua: "+super.toString()+ " , salinidad ="+salinidad;
	}
	

}
