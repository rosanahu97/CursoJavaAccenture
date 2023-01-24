package curso.s2.excepciones;

public class Ejercicios {

	public static void main(String[] args) throws MiExcepcion {
		
		calcular(300,0);
		calcular(0,300);
	
	}
	

	public static void calcular(int a,int b) {
		int res;
		try {
			res = b/a;
			System.out.println("El resultado es: "+res);
		
		}catch(ArithmeticException e) {
			//cuando captura el error de tipo aritmetrico, lanza la excepcion
			throw new MiExcepcion(e.toString());
		
		}finally{
			//imprimir el mensaje aunque captura el error
			System.out.println("Programa finalizado");
		}
	}

}
