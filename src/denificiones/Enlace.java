package denificiones;

import java.time.LocalTime;

public class Enlace {

 public String url;
 public LocalTime hora;
 public int indice;
 public static int contador = 0;
 
 public Enlace() {
	 indice = contador++;
 }
 
 public void modificaciones() {
	 Definiciones def = new Definiciones();
	 Definiciones def2 = new Definiciones();
	 def.nombre = "Esto es def";
	 def2.nombre = "Esto es def2";
	 System.out.println("nombre def1 = "+def.nombre);
	 System.out.println("nombre def2 = "+def2.nombre);
	
	 
	 def.setImporte(123);
 }
}
