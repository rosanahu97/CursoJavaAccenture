package curso.g2.condicionales;


public class Conversor {

	public static void main(String[] args) {
		conversionNumero(11);
		conversionNumero(72);
		conversionNumero(99);
		conversionNumero(30);
		conversionNumero(20);
		conversionNumero(25);
		conversionNumero(54);
		conversionNumero(10);
		conversionNumero(9);
	}
	/**Funcion para convertir los numeros en letras
	 * @param n numero entero
	 * */
	public static void conversionNumero(int n){
	
	String[] p1= {"","Diez","Veinte","Trenta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
	String[] p2= {"","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueves"};
	String[] p3= {"Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Diesiocho","Diecinueves"};
	//calculo la decena(parte entero) y la unidad(resto)
	int decena=n/10;
	int unidad=n%10;
	//los numeros de 1-9
	if(decena<1) {
		System.out.println(p2[unidad]);
	}
	//los numeros de 10-19
	else if(decena==1) {
		System.out.println(p3[unidad]);
	//a partir del numero 20
	}else if(decena==2) {
		if(unidad == 0) {
		System.out.println(p1[decena]);

		}else {
		System.out.println("Veinti"+p2[unidad]);
		}
		
	}else {
		if(unidad==0) {
			System.out.println(p1[decena]);
		}else {
		System.out.println(p1[decena] +" y "+p2[unidad]);
	}
	}
	}
}
