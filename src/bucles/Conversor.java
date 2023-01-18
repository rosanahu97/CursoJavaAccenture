package bucles;

public class Conversor {

	public static void main(String[] args) {
		ConversionNumero(11);
		ConversionNumero(72);
		ConversionNumero(99);
		ConversionNumero(30);
		ConversionNumero(20);
		ConversionNumero(10);
		ConversionNumero(9);
	}
	
	public static void ConversionNumero(int n){
		
	String[] p1= {"","Diez","Veinte","Trenta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
	String[] p2= {"","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueves"};
	String[] p3= {"Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Diesiocho","Diecinueves"};
	int decena=n/10;
	int unidad=n%10;
	if(decena<1) {
		System.out.println(p2[unidad]);
	}
	else if(decena==1) {
		System.out.println(p3[unidad]);
	}else {
		if(unidad==0) {
			System.out.println(p1[decena]);
		}else {
		System.out.println(p1[decena] +" y "+p2[unidad]);
	}
	}
	}
}
