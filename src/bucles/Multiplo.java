package bucles;

public class Multiplo {

	public static void main(String[] args) {
	System.out.println("Ejercicio1------------");
		comparacion(10,20);
		comparacion(15,10);	
		comparacion(10,10);
		comparacion(2,0);
		
	System.out.println("Ejercicio2------------");	
		
		
	}

	public static void comparacion(int a,int b) {
		if(a == b) {
				System.out.println(a+" y "+b+" son iguales");
			}else {
				if(a>b) {
					System.out.println(a+" es mayor que "+b);
				}else {
					System.out.println(b+" es mayor que "+a);

				}	
		}
		if(a>0 & b>0) {
		if(a%b ==0 | b%a == 0) {
			System.out.println("Son multiplos");
		}else {
			System.out.println("No son multiplos");

		}
		}else {
			System.out.println("No son multiplos");

		}
		
	}
		
}
