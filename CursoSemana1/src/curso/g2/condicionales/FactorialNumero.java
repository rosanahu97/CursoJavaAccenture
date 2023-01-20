package curso.g2.condicionales;

public class FactorialNumero {

	public static void main(String[] args) {
		
		calcularFactorial(5);
		calcularFactorial(4);
		calcularFactorial(0);
		calcularFactorial(-2);
	}
	/**
	 * funcion para calcular la factorial de un numero entero
	 * @param n
	 */
	public static void calcularFactorial(int n) {
		int res=1;
		//compruebo si es un numero correcto o no 
		if(n>=0) {
		for(int i=n;i>0;i--) {
			res = res *i;
		}
		System.out.println("El resultado final es: "+res);
	}else {
		//en caso negativo, muestra el mensaje de error
		System.out.println("Error, numero negativo: "+n);

	}
	}

}
