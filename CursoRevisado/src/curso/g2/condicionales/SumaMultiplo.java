package curso.g2.condicionales;

public class SumaMultiplo {

	public static void main(String[] args) {
		//inicializar los valores
		int n=5;
		int suma=0;
		/*el bucle for se ejecuta 10 veces para 
		 * calcular los 10 primeros multiplos de 5*/
		for(int i=1;i<=10;i++) {
			//calculo la suma de los multiplos
			suma += n*i;
			//imprimo el multiplo por la pantalla
			System.out.println(n*i);
		}
		//imprimo el resultado final
		System.out.println("El total es:"+suma);

	}

}
