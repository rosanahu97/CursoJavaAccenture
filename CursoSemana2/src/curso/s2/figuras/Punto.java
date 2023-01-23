package curso.s2.figuras;

public class Punto {
	
	private int coordX;
	private int coordY;

	
	public Punto (int x,int y) {
		super();
		setCoordX(x);
		setCoordY(y);
	}
	
	
	public void cambiarXY() {
		int aux = this.getCoordX();
		setCoordX(getCoordY());
		setCoordY(aux);
	}
	


	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
	
	
}
