package curso.s2.interfazFuncional;

public class PruebaInterfaz {

	public static void main(String[] args) {
		Interface1 objeto = (a,b)->a+b;
		System.out.println(objeto.cuenta(3, 5));
		System.out.println(objeto.resuelto(20));
		System.out.println(objeto.saluda());

	}

}
