package curso.s2.dibujos;

public class Triangulo extends Figuras{
	
	//definir las variables
	private double base;
	private double altura;
	//constructor con parametros
	public Triangulo(int x, int y,int b,int alt) {
		super(x, y,alt,b);
		
	}


	@Override
	void dibujar() {
		System.out.println("Dibujando triangulo con base = "+getLargo()+", altura = "+getAncho());
			
	}
	@Override
	double calcularArea() {
		
		return (getLargo()*getAncho())/2;
	}
	
	
	
}
