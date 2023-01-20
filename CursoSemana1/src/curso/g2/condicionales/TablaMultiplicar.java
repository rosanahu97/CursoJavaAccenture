package curso.g2.condicionales;

public class TablaMultiplicar {

	public static void main(String[] args) {
		//el numero i toma valor de 1-10
		for(int i =1;i<=10;i++) {
			System.out.println("Tabla del "+i);
			System.out.println("-------------");
			//el nuemro j toma valor de 1-10
			for(int j=1;j<=10;j++) {	
				//multiplico dos numeros
				int res = i*j;
				System.out.println(i+" x "+j+" = "+res);
			}
		}

	}
	

}
