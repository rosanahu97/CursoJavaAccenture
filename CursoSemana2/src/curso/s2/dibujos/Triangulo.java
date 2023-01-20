package curso.s2.dibujos;

public class Triangulo extends Figuras{
	
	//definir las variables
	private double base;
	private double altura;
	//constructor con parametros
	public Triangulo(int x, int y,double b,double alt) {
		super(x, y);
		this.setAltura(alt);
		this.setBase(b);
		
	}


	@Override
	void dibujar() {
		System.out.println("Dibujando triangulo con base = "+this.getBase()+", altura = "+this.getAltura());
			
	}
	@Override
	double calcularArea() {
		
		return (this.getAltura()*this.getBase())/2;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
