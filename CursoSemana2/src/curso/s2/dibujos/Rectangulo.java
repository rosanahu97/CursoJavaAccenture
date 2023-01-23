package curso.s2.dibujos;

public class Rectangulo extends Figuras{
	//definir las variables 
	private int ancho;
	private int largo;
	
	//constructor con parametros 
	public Rectangulo(int x,int y,int a,int l) {
		super(x,y,a,l);

	}
	
	//dibujar el rectangulo usando el bucle for 
	@Override
	void dibujar() {
		System.out.println("Dibujando rectangulo con largo = "+getLargo()+", ancho = "+getAncho());
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


	
}
