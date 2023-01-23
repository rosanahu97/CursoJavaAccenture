package curso.s2.automovil;

public class Camion extends Auto {
	
	private int pesoMaximo;
	private int precio;
	
	
	
	public Camion(int numMarchas, int velocidadMaxima, int numChasis, int numRuedas,
				int peso,int precio) {
		super(numMarchas, velocidadMaxima, numChasis, numRuedas);
		setPesoMaximo(peso);
		setPesoMaximo(precio);
	}
	
	public int getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return  "El camion: "+super.toString()+ " [pesoMaximo=" + pesoMaximo + ", precio=" + precio + "]";
	}

	
	
	
	
	
}
