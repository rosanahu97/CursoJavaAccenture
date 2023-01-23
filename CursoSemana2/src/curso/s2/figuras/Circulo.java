package curso.s2.figuras;

public class Circulo extends Figuras{
	//definir las variables 
	private final static double PI = Math.PI;
	
	//constructor con parametros
	public Circulo(int x, int y,int ratio) {
		super(x, y,ratio*2,ratio*2);
		setRatio(ratio);
	}


	//dibujar el circulo con el ratio correspondiente
	@Override
	void dibujar() {
		System.out.println("Dibujando circulo con ratio = "+getRatio());
		
	}
	//La funcion calcularArea devuelve la area del circulo
	@Override
	double calcularArea() {
		
		return PI*Math.pow(getRatio(),2);
	}

	
	
	
}
