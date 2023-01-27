package curso.s2.banco.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public interface Filtros {
	public final static int ANNOMIN =3;
	public final static int ANNOMAX =5;
	/**
	 * El nombre tiene que estar comprendido entre longMin y lonMax
	 * */
	public default boolean validarNombre(String n,int longMin,int lonMax) {
		return n.length()>longMin && n.length()<lonMax;
	}
	/**
	 * El nombre tiene que estar comprendido entre longMin y lonMax
	 * */
	public default boolean validarFechaCad (LocalDate fecha) {
		
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
	
	public default boolean validarConcepto(String concept,int min,int max) {
		return concept.length()>min && concept.length()<max;
	}
	
	
	public LocalDate validarFecha(String fecha);
	
	public default LocalDate validarFecha(String fecha, String formato) {
		
		LocalDate resFecha=null;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
	try {
				resFecha = LocalDate.parse(fecha,dtf);
				System.out.println(resFecha.toString());
				
	
	}catch(DateTimeParseException e) {
			System.out.println("Error,no se puede pasar el string a Date");
	}

		return resFecha;
	}
}
