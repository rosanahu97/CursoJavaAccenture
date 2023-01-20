package curso.s2.agroalimentaria;

public class Producto {
	private String fechaCad;
	private int numLote;
	
	
	public Producto() {}
	
	

	public String getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(String fechaCad) {
		this.fechaCad = fechaCad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "producto con lote: "+numLote+ " ,fecha caducidad: "+fechaCad.toString();
	}
	
	
	
}
