package curso.s2.automovil;

public class Auto implements Abd {
	private int numMarchas;
	private int velocidadMaxima;
	private int numChasis;
	private int numRuedas;
	

	public Auto(int numMarchas, int velocidadMaxima, int numChasis, int numRuedas) {
		super();
		setNumChasis(numChasis);
		setNumMarchas(numMarchas);
		setNumRuedas(numRuedas);
		setVelocidadMaxima(velocidadMaxima);
		AccesoABD dao = new AccesoABD();
		dao.Accesoleer(this);
	}
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getNumChasis() {
		return numChasis;
	}
	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	@Override
	public String toString() {
		return " [numMarchas=" + numMarchas + ", velocidadMaxima=" + velocidadMaxima + ", numChasis=" + numChasis
				+ ", numRuedas=" + numRuedas + "]";
	}
	@Override
	public void leer() {
	
		
	}
	@Override
	public void grabar() {
	
		
	}
	
	
	
	
	
}
