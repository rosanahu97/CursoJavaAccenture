package curso.s2.herencia.agroalimentaria;

public class ProductoFresco extends Producto{
	private String fechaEnv;
	private String origen;
	
	/**
	 * 
	 * @param fechaC fecha de caducidad
	 * @param nLote numero de lote
	 * @param e fecha de envasado
	 * @param o origen del producto
	 * 
	 * 
	 * */
	public ProductoFresco (String fechaC,int nLote,String e,String o) {
	super();
	this.setFechaCad(fechaC);
	this.setNumLote(nLote);
	this.setFechaEnv(e);
	this.setOrigen(o);
	}
	
	
	public String getFechaEnv() {
		return fechaEnv;
	}
	public void setFechaEnv(String fechaEnv) {
		this.fechaEnv = fechaEnv;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	@Override
	public String toString() {
		return "Producto Fresco: "+super.toString()+" , fechaEnv=" + fechaEnv + ", origen=" + origen;
	}
	
}
