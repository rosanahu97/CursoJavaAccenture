package curso.g2.condicionales;

public class Fechas {
	//definir las variables
	static final int DIAS =30;
	static final int MESES =12;
	static int[] dias= {31,28,31,30,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		System.out.println("Primera version-------");
		comprobarFecha(30,13,2020);
		comprobarFecha(30,11,2020);
		comprobarFecha(1,13,2022);
		comprobarFecha(1,13,0);
		System.out.println("Segunda version-------");
		comprobarFecha2(30,13,2020);
		comprobarFecha2(30,11,2020);
		comprobarFecha2(31,11,2020);
		comprobarFecha2(1,13,2022);
		comprobarFecha2(1,13,0);
		System.out.println("Tercera version-------");
		comprobarFecha3(30,13,2020);
		comprobarFecha3(30,11,2020);
		comprobarFecha3(31,11,2020);
		comprobarFecha3(1,13,2022);
		comprobarFecha3(1,13,0);
		System.out.println("Cuarta version-------");
		comprobarFecha4(30,13,2020);
		comprobarFecha4(30,11,2020);
		comprobarFecha4(31,11,2020);
		comprobarFecha4(1,13,2022);
		comprobarFecha4(1,13,0);
		comprobarFecha4(29,2,2020);
		comprobarFecha4(28,2,2020);
	}
	/**
	 * Funcion para comprobar la validez de la fecha,teniendo en cuenta los años biciestos
	 * @param d dia
	 * @param m mes
	 * @param y año 
	 * */
	public static void comprobarFecha4(int d,int m,int y) {
		if(y>0) {
			switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: if(d==31) {
				System.out.println("Fecha correcta");
			}else {
				System.out.println("dia incorrecta");

			} break;
			case 4:
			case 6:
			case 9:
			case 11:if(d==30) {
				System.out.println("Fecha correcta");
			}else {
				System.out.println("dia incorrecta");

			}break;
			case 2 : if((y%4==0 && y%100!=0) | y%400==0) {
					if(d==29) {
					System.out.println("Fecha correcta");
					}else {
					System.out.println("dia incorrecta");

					}
			}else {
				if(d==28) {
				System.out.println("Fecha correcta");
				}else {
				System.out.println("dia incorrecta");

				}
			}break;
			
			default:System.out.println("mes incorrecta"); break;	
			}
		}else {
			System.out.println("Año incorrecto");
		}
	}
	
	
	/**
	 * Funcion para comprobar la validez de la fecha,usando array
	 * @param d dia
	 * @param m mes
	 * @param y año 
	 * */
	
	public static void comprobarFecha3(int d,int m,int y) {
		if(y>0) {
			if(m>0 && m<=MESES) {
				if(d==dias[m-1]) {
					System.out.println("Fecha correcta");

				}else {
					System.out.println("Dia incorrecta");

				}
					
			}else {
				System.out.println("Mes incorrecta");

			}
		}else {
			System.out.println("Año incorrecta");

		}
	}
	/**
	 * Funcion para comprobar la validez de la fecha,sin usar array
	 * @param d dia
	 * @param m mes
	 * @param y año 
	 * */
	public static void comprobarFecha2(int d,int m,int y) {
	if(y>0) {
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: if(d==31) {
			System.out.println("Fecha correcta");
		}else {
			System.out.println("dia incorrecta");

		} break;
		case 4:
		case 6:
		case 9:
		case 11:if(d==30) {
			System.out.println("Fecha correcta");
		}else {
			System.out.println("dia incorrecta");

		}break;
		case 2 :if(d==28) {
			System.out.println("Fecha correcta");
		}else {
			System.out.println("dia incorrecta");

		}break;
		default:System.out.println("mes incorrecta"); break;	
		}
	}else {
		System.out.println("Año incorrecto");
	}
	}
	
	/**
	 * Funcion para comprobar la validez de la fecha,suponiendo que un mes tiene 30 dias
	 * @param d dia
	 * @param m mes
	 * @param y año 
	 * */	
	
	
public static void comprobarFecha(int d,int m,int y) {
	if(d>0 && d<=DIAS) {
		if(m>0 && m<=MESES) {
			if(y>0) {
				System.out.println("Fecha correcta");
			}else {
				System.out.println("Año incorrecta");

			}
		}else {
			System.out.println("Mes incorrecta");

		}
	}else {
		System.out.println("Dia incorrecta");

	}
	}

}
