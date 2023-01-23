package curso.s2.figuras;

public abstract class Figuras {
	// definir las coordenadas del dibujo
	
	private int coordenadaX;
	private int coordenadaY;
	private int ancho;
	private int largo;
	private int ratio;
	//definir una variable de clase Punto
	private Punto punto;
	private Texto text;
		
	public Figuras (int x, int y,int a,int l) {
		setCoordenadaX(x);
		setCoordenadaY(y);
		//crear un punto con la coordenada recibida
		punto = new Punto(x,y);
		text = new Texto("Titulo1","Descripcion...");

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
	
	
	public Texto getText() {
		return text;
	}

	public void setText(Texto text) {
		this.text = text;
	}

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

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
