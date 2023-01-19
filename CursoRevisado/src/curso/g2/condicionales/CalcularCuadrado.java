package curso.g2.condicionales;

public class CalcularCuadrado {

	public static void main(String[] args) {
	
		for(String s:args) {
			//pasa el valor de tipo string a tipo intero
			int numero =Integer.parseInt(s);
			calcularCuadrado(numero);
		}

	}
	/**
	 * funcion para calcular el cuadrado 
	 * @param n  numero entero 
	 */
	public static void calcularCuadrado(int n) {
		System.out.println("El cuadrado de "+n+"es : "+Math.pow(n, 2));
	}

}
