package curso.s2.banco.util;

import java.time.LocalDate;

public class Filtro {

	
	public static boolean validarNombre(String n,int longMin,int lonMax) {
		return n.length()>longMin && n.length()>lonMax;
	}
	
	public static boolean validarFechaCad (LocalDate fecha) {
		int yactual = LocalDate.now().getYear();
		int y = fecha.getYear();
		return (y-yactual)>3 && (y-yactual)<5; 
	}
	
	
	public static boolean validarConcepto(String concept) {
		return concept.length()>100 && concept.length()<100;
	}
	
}
