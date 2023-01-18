package operadores;

public class CalculoFactura {
	final static int IVA =21;
	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		
		cantidad=3;
		unidades=12;
		precio =5.4;
		importe = cantidad*unidades*precio;
		double iva= importe*IVA/100;
		total = (int)(importe+iva);
		
		System.out.println("cantidad "+ cantidad);
		System.out.println("unidades "+ unidades);
		System.out.println("precio "+ precio);
		System.out.println("Importe"+ importe);
		System.out.println("Iva "+iva);
		System.out.println("Total "+ total + "\tdeberia ser :" +(importe+iva));
		

	}

}
