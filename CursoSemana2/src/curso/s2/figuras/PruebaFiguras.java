package curso.s2.figuras;

public class PruebaFiguras {

	public static void main(String[] args) {
		//crear un triangulo
		Figuras f1 = new Triangulo(3, 3, 10, 2);
		double areaTriangulo =f1.calcularArea();
		System.out.println("El area del triangulo es: "+areaTriangulo);
		f1.dibujar();
		//crear un rectangulo
		Figuras f2 = new Rectangulo(4, 4, 6, 8);
		double areaRectangulo = f2.calcularArea();
		System.out.println("El area del rectangulo es: "+areaRectangulo);
		f2.dibujar();
		//crear un circulo
		Figuras f3 = new Circulo(4, 4, 2);
		double areaCirculo = f3.calcularArea();
		System.out.println("El area del circulo es: "+areaCirculo);
		f3.dibujar();
		
		
		//Prueba de la inclusion de la clase Punto
		f3.getPunto();
		

	}

}
