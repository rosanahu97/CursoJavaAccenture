package curso.s2.dibujos;

public class Circulo extends Figuras{
	//definir las variables 
	private double ratio;
	private final static double PI = Math.PI;
	
	//constructor con parametros
	public Circulo(int x, int y,double ratio) {
		super(x, y);
		this.setRatio(ratio);
	}


	//dibujar el circulo con el ratio correspondiente
	@Override
	void dibujar() {
		System.out.println("Dibujando circulo con ratio = "+this.getRatio());
		
	}
	//La funcion calcularArea devuelve la area del circulo
	@Override
	double calcularArea() {
		
		return PI*Math.pow(this.getRatio(),2);
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
	
}
