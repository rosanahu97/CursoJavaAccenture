package curso.s2.herenciaEquipos;

import java.util.ArrayList;
import java.util.List;

public class PruebaEquipo {

	public static void main(String[] args) {
		int contadorId =100;
		//crear una lista array para almacenar los objetos 
		List<Equipo> equipoLista = new ArrayList<Equipo>();
		Equipo e1 = new Entrenador(++contadorId, "Angel", "Jimenez Jimenez", 50, "Federacion 1");
		Equipo f1 = new Futbolista(++contadorId, "Pepe","Lopez Lopez",20, 10,"portero");
		Equipo m1 = new Masajista(++contadorId, "Juan", "Garcia Garcia", 40, "Titulacion plus", 15);
		//añadimos los objetos a la lista
		equipoLista.add(e1);
		equipoLista.add(f1);
		equipoLista.add(m1);
		//Recorrer la lista con foreach y pasamos el parametro al metodo imprimir 
		equipoLista.forEach((eq) -> imprimir(eq));
	
	
	
	}

	private static void imprimir(Equipo eq) {
		//llamar los metodos comunes
		eq.concentrarse();
		eq.viajar();
		//usamos instanceof para identificar los objetos 
		if( eq instanceof Entrenador) {
			//hacemos un casting de la clase Entrenador
			Entrenador e = (Entrenador)eq;
			e.dirigirEntrenamiento();
			e.dirigirPartido();
		}
		if (eq instanceof Futbolista) {
			//hacemos un casting de la clase Futbolista
			Futbolista f = (Futbolista)eq;
			f.entrenar();
			f.jugarPartido();
			
		}
		if (eq instanceof Masajista) {
			//hacemos un casting de la clase Masajista
			Masajista m=(Masajista)eq;
			m.darMasaje();
		}
		
		
		
	}

}
