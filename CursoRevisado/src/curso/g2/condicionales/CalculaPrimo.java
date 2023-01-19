package curso.g2.condicionales;

public class CalculaPrimo {

	public static void main(String[] args) {
		//inicializar el contador con valor 0
		int contador=0;
		//comprueba si el numero es primo o no
		for(int i=2;i<=100;i++) {
			if(esPrimo(i)) {
				//en caso positivo, incremento el contador
				contador++;
				System.out.println(i);

			}
		}
		System.out.println("Hay "+contador+" numeros primos");

	}
	
	/**
	 * Funcion para comprobar si un numero es primo o no  
	 * @param n numero entero
	 * */
	public static boolean esPrimo(int n) {
		boolean loes=true;
		//inicializa valor igual que 2, porq cualquier numero es divisible entre 1
		int i =2;
		while(i<n && loes) {
			if(n%i==0) {
				//si un numero tiene divisor, entonces no es un numero primo
				loes= false;
			}
			i++;
		}
	return loes;
	}

}
