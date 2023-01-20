package curso.s2.clasegenerica;

public class PruebaIntercambio {

	public static void main(String[] args) {
		String t1="Miguel";
		String t2="Antonio";
		int n1=20;
		int n2=30;
		//crear los dos objetos de prueba, de distinta clase
		Intercambio<String> obj1 = new Intercambio(t1,t2);
		Intercambio<Integer> obj2 = new Intercambio(n1,n2);
		System.out.println("Antes de cambiar el valor:  ");
		System.out.println("Texto = "+obj1.getPrimero()+" Numero = "+obj2.getPrimero());
		// llamar la funcion para hacer el cambio de valor
		obj1.intercambiarValor(obj1);
		obj2.intercambiarValor(obj2);
		System.out.println("Despues de cambiar el valor:  ");
		System.out.println("Texto = "+obj1.getPrimero()+" Numero = "+obj2.getSegundo());
	}

}
