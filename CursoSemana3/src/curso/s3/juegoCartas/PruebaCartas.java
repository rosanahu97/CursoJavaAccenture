package curso.s3.juegoCartas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaCartas {
	static int CARTAS =5;
	static Set<Jugador> jugadores;
	static Set<Carta> cartas = new HashSet<>();
	static String TIPO_CARTA = Paquete.POKER;
	
	
	public static void main(String[] args) {
		
		Paquete paq = new Paquete(TIPO_CARTA);
		//paq.mostarCartas();
		cartas = paq.getCartas();
		jugadores=crearJugadores();
		repartirCartas(cartas,jugadores);
		visualizar(jugadores);
		analizarJugador(jugadores);
		int b =5;
		int c =8;
		int a = b++ + ++c;
		System.out.println("b"+b);
		System.out.println(a);

	}
	
	
	
	/**
	 *Metodo para analizar los jugadores
	 *@param un conjunto de jugadores 
	 */
	private static void analizarJugador(Set<Jugador> jug) {
		jug.forEach(j->analizaJugador(j));	
	}
	
	/**
	 *Metodo para analizar un jugador
	 *@param un jugador 
	 */




	private static void analizaJugador(Jugador j) {
		Set<Carta> cartas = j.getMano();
		
	}
	
	
	




	/**
	 * Metodo para visualizar los jugadores,mostrando su nombre y las cartas que tiene en la mano
	 * @param jug el conjunto jugador
	 */
	private static void visualizar(Set<Jugador> jug) {
		for(Jugador j :jug) {
			System.out.println(j.getNombre());
			for(Carta c:j.getMano()) {
				System.out.println(c.toString());
			}
		}
		
	}
	/**
	 * Metodo para repartir las cartas 
	 * @param jug el conjunto jugadores
	 * @param car el conjunto cartas
	 */
	private static void repartirCartas(Set<Carta> car, Set<Jugador> jug) {
		Iterator<Carta> itCarta = car.iterator();
		for(int i =0;i<CARTAS;i++) {
			for(Iterator<Jugador> itJugador = jug.iterator(); itJugador.hasNext();) {
				if(itCarta.hasNext()) {
					repartirCarta(itCarta.next(),itJugador.next());
					itCarta.remove();

				}
			}
				
		}
	}
	
	/**
	 * Metodo para repartir una carta 
	 * @param jug el jugador quien recibe la carta
	 * @param car la carta que va a recibir 
	 */	
	private static void repartirCarta(Carta car, Jugador jug) {
		Set<Carta> cartas = jug.getMano();
		cartas.add(car);
		jug.setMano(cartas);
		
	}
	/**
	 * Metodo para crear los jugadores del partido
	 * @return devuelve un conjunto de jugadores
	 */
	private static Set<Jugador> crearJugadores() {
		Set<Jugador> listaJugadores = new HashSet<>();
		Jugador j1 = new Jugador();
		j1.setNombre("Jugador1");
		j1.setEdad(20);
		listaJugadores.add(j1);
		Jugador j2 = new Jugador();
		j2.setNombre("Jugador2");
		j2.setEdad(25);
		listaJugadores.add(j2);
		Jugador j3 = new Jugador();
		j3.setNombre("Jugador3");
		j3.setEdad(30);
		listaJugadores.add(j3);
		Jugador j4 = new Jugador();
		j4.setNombre("Jugador4");
		j4.setEdad(35);
		listaJugadores.add(j4);
		
		return listaJugadores; 
	}



}
