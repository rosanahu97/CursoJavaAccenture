package curso.g2.condicionales;

public class ListarNumeros {

	public static void main(String[] args) {
		int numero =100;
		boolean fin = false;
		while(!fin) {
			if(numero<0) {
				//cuando el numero sea menor que 0, se sale del bucle for
				fin=true;
			}else {
			System.out.println(numero);
			//decremento el numero
			numero=numero-23;
			}
		}
		
		
		
	}

}
