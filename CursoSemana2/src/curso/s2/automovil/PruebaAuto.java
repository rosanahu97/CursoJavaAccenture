package curso.s2.automovil;

public class PruebaAuto {

	public static void main(String[] args) {
		
		Auto a1 = new Moto(5, 100, 2, 2, 100);
		System.out.println(a1.toString());
		Auto c1 = new Coche(6, 150, 5, 4, "rojo", 5, "Ford");
		System.out.println(c1.toString());
		Coche c2 = new Coche(6, 150, 5, 4, "Blanco", 5, "Seat");
		System.out.println(c2.toString());
		c2.activarReductora(true);
		
	}

}
