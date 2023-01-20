package curso.g2.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ejemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList();
		String[] nombre = {"Juan","Pepe","Maria","Ana"};
		//insertar todos los elementos a la lista
		lista.addAll(Arrays.asList(nombre));
		//imprimir los elementos de la lista
		System.out.println("For each ----");

		for(String s:lista) {
			System.out.println(s);
		}
		//comprobamos si la lista contiene el nombre o no
		boolean esta =lista.contains("Juan");
		System.out.println(esta? "contiene el nombre introducido": "no esta el nombre");
		
		//recorrer la lista con el iterador
		System.out.println("Iterador ----");
		Iterator<String> it =lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Get ----");
		for(int i =0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}

	}

}
