package denificiones;

import java.time.LocalTime;

/**
 * 
 *@author yuqian.hu
 *
 *Prueba de como definir los campos 
 * */

public class Definiciones {
	private static boolean seguro = false;
	private static int importe = 0;
	private static double cantidad = 0d;
	/*
	 * static=>cuando crea una nueva instancia,se machaca el valor anterior
	   el valor pertenece a la clase y no al objeto
	   EJ: def1.descripcon = 1
	   	   def2.descripcion =4;
	   	   system.out ...
	   	   def1 imprime 4 y def2 imprime4 
	   comparte el valor entre todos !!!!!
	   
	 */
	private static String descripcion="\"Hola mundo\"";
	public String nombre ="";
	public final String VALOR=" ";
	
	public int getImporte() {
		return importe;
	}
	public void setImporte(int imp) {
		if(imp >=0) {
			importe = imp;
		}
	}
	
	
	
	/**
	 * Lanzamiento por consola
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(descripcion);
		
		Enlace s1 = new Enlace();
		s1.hora = LocalTime.now();
		s1.url="http1";
		
		Enlace s2 = new Enlace();
		s2.hora = LocalTime.now();
		s2.url="http2";
		
		System.out.println(s1.indice+" "+s1.url.toString()+" "+s1.hora);
		System.out.println(s2.indice+" "+s2.url.toString()+" "+s2.hora);		
		
		
		
	}
	public static void valores() {
		importe =123;
		cantidad = 500.22;
		char separador ='/';
		
		
	}

}
