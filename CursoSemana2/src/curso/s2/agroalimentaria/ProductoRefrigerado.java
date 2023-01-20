package curso.s2.agroalimentaria;

public class ProductoRefrigerado extends Producto{
	private int codSuperv;

	/**
	 * 
	 * @param fechaC fecha de caducidad
	 * @param nLote numero de lote
	 * @param c codigo del supervisador
	 * 
	 * 
	 * */
	public ProductoRefrigerado(String fechaC,int nLote,int c) {
		super();
		this.setFechaCad(fechaC);
		this.setNumLote(nLote);
		this.setCodSuperv(c); 
	}

	public int getCodSuperv() {
		return codSuperv;
	}

	public void setCodSuperv(int codSuperv) {
		this.codSuperv = codSuperv;
	}

	@Override
	public String toString() {
		return "Producto Refrigerado: "+super.toString()+" , codSuperv=" + codSuperv ;
	}
	
	
	
	
}
