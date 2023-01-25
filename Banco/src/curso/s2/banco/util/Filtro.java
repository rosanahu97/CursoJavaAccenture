package curso.s2.banco.util;

import java.time.LocalDate;

public class Filtro {

	private final static int ANNOMIN =3;
	private final static int ANNOMAX =5;
	/**
	 * El nombre tiene que estar comprendido entre longMin y lonMax
	 * */
	public static boolean validarNombre(String n,int longMin,int lonMax) {
		return n.length()>longMin && n.length()<lonMax;
	}
	/**
	 * El nombre tiene que estar comprendido entre longMin y lonMax
	 * */
	public static boolean validarFechaCad (LocalDate fecha) {
		
		if(fecha == null) {
			return false;
		}
		int yactual = LocalDate.now().getYear();
		int y = fecha.getYear();
		return (y-yactual)>ANNOMIN && (y-yactual)<ANNOMAX; 
	}
	/**
	 * El concepto tiene que estar comprendido entre longitud Min y Max
	 * */
	
	public static boolean validarConcepto(String concept,int min,int max) {
		return concept.length()>min && concept.length()<max;
	}
	
}
