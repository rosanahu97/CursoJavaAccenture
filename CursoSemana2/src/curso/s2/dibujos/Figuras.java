package curso.s2.dibujos;

public abstract class Figuras {
	// definir las coordenadas del dibujo
	
	private int coordenadaX;
	private int coordenadaY;
	private int ancho;
	private int largo;
	private int ratio;
		
	public Figuras (int x, int y,int a,int l) {
		setCoordenadaX(x);
		setCoordenadaY(y);
		setAncho(a);
		setLargo(l);
		
	}
	
	/**
	 * metodo para dibujar la figura 
	 */
	abstract void dibujar();
	/**
	 * FUncion para calcular la area de la figura 
	 */
	abstract double calcularArea();
	
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getRatio() {
		return ratio;
	}
	public void setRatio(int ratio) {
		this.ratio = ratio;
	}
	
}
