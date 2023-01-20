package curso.s2.agroalimentaria;

public class PruebaProducto {

	public static void main(String[] args) {
		//creamos diferentes productos con sus parametros correspondientes 
		Producto p1 = new ProductoFresco("23/01/2023", 100, "12/01/2023", "España");
		System.out.println(p1.toString());
		Producto p2 = new ProductoRefrigerado("23/01/2023", 200, 12345);
		System.out.println(p2.toString());		
		Producto p3 = new CongeladoPorAgua("23/01/2023", 300, 20, 20);
		System.out.println(p3.toString());	
		Producto p4 = new CongeladoPorAire("23/01/2023", 400, 20, 20, 20, 20, 20);
		System.out.println(p4.toString());	
		Producto p5 = new CongeladoPorNitrogeno("23/01/2023", 500, 99, "metodo1", 99);
		System.out.println(p5.toString());
	}
	
	
}
