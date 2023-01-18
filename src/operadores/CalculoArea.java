package operadores;

public class CalculoArea {
final static double PI = Math.PI;
	public static void main(String[] args) {
		int radio = 23;
		double area;
		double longitud;
		area = PI*Math.pow(radio, 2);
		longitud =2*PI*radio;
		System.out.println("El area del circulo es : "+area);
		System.out.println("La longitud del circulo es : "+longitud);
	}
}