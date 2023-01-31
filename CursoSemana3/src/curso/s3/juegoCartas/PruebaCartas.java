package curso.s3.juegoCartas;

import java.util.HashSet;
import java.util.Set;

public class PruebaCartas {
	static int CARTAS =5;
	static Set<Jugador> jugadores = new HashSet<>();
	static Set<Carta> cartas = new HashSet<>();
	static String TIPO_CARTA = Paquete.BARAJA;
	
	
	public static void main(String[] args) {
		Paquete paq = new Paquete(TIPO_CARTA);
		paq.mostarCartas();
		crearJugadores();
		repartirCartas();

	}
	private static void crearJugadores() {
		Jugador j1 = new Jugador();
		j1.setNombre("Jugador1");
		j1.setEdad(20);
		jugadores.add(j1);
		Jugador j2 = new Jugador();
		j2.setNombre("Jugador2");
		j2.setEdad(25);
		jugadores.add(j2);
		Jugador j3 = new Jugador();
		j3.setNombre("Jugador3");
		j3.setEdad(30);
		jugadores.add(j3);
		Jugador j4 = new Jugador();
		j4.setNombre("Jugador4");
		j4.setEdad(35);
		jugadores.add(j4);
		
	}

	private static void repartirCartas() {
		int total=CARTAS*jugadores.size();
		for(int i =0;i<total;i++) {
			for(int j=0;j<jugadores.size();j++) {

			}
				
		}
	}

}
