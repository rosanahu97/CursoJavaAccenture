package curso.s2.dibujos;

public class Rectangulo extends Figuras{
	//definir las variables 
	private double ancho;
	private double largo;
	
	//constructor con parametros 
	public Rectangulo(int x,int y,double a,double l) {
		super(x,y);
		this.setAncho(a);
		this.setLargo(l);
	}
	
	//dibujar el rectangulo usando el bucle for 
	@Override
	void dibujar() {
		System.out.println("Dibujando rectangulo con largo = "+this.getLargo()+", ancho = "+this.getAncho());
		for(int i=0;i<this.getAncho();i++) {
			
			for(int j =0;j<this.getLargo();j++) {
				//imprimir * por lineas 
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	@Override
	double calcularArea() {
		
		return this.getAncho()*this.getLargo();
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getLargo() {
		return largo;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}
	

}
