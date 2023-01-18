package bucles;

public class Notas {

	public static void main(String[] args) {
		
		nota(2);
		nota(4);
		nota(9);
		nota(99);
	}	
	public static void nota(int n) {
		switch(n) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Insuficiente"); break;
		case 5: System.out.println("Suficiente"); break;
		case 6: System.out.println("Bien"); break;
		case 7:
		case 8:System.out.println("Notable"); break;
		case 9:
		case 10:System.out.println("Sobresaliente"); break;
		default:System.out.println("Nota incorreta"); break;
		}
	}
	
}
