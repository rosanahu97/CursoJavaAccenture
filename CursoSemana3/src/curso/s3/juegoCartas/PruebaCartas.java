package curso.s3.juegoCartas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
		
	}
	
	
	
	/**
	 *Metodo para analizar los jugadores
	 *@param un conjunto de jugadores 
	 */
	private static void analizarJugador(Set<Jugador> jug) {
		jug.forEach(j->analizarJugador(j));	
	}
	
	/**
	 *Metodo para analizar un jugador
	 *@param un jugador 
	 */

	private static void analizarJugador(Jugador j) {
		Set<Carta> cartas = j.getMano();
		TreeMap<Integer,Integer> map1_numero = new TreeMap<Integer,Integer>();
		TreeMap<String,Integer> map2_palo = new TreeMap<String,Integer>();
		
		int numDescarte;
		
		for(Carta c :cartas) {
			if(map1_numero.get(c.getNumero())==null) {
				map1_numero.put(c.getNumero(), 1);
			}else {
				int res =map1_numero.get(c.getNumero());
				map1_numero.put(c.getNumero(), ++res);
			}
		}
		
		for(Carta c :cartas) {
			if(map2_palo.get(c.getPalo())==null) {
				map2_palo.put(c.getPalo(), 1);
			}else {
				int res =map2_palo.get(c.getPalo());
				map2_palo.put(c.getPalo(), ++res);
			}
		}
		switch(map1_numero.size()) {
			case 5: if(map2_palo.size()==1 && isEscalera(map1_numero)) {
						System.out.println(j.getNombre()+" tiene escalera real o de color");
					}else if(isEscalera(map1_numero)) {
						System.out.println(j.getNombre()+" tiene escalera");
					}else {
						numDescarte =5;
					}break;
	
			case 4:	System.out.println(j.getNombre()+" tiene una pareja");
					numDescarte = 3;
					break;
			case 3:	if(isTrio(map1_numero)) {
						System.out.print(j.getNombre()+" tiene trio ");
						numDescarte = 2;
					}else {
						//si no es trio,entonces tiene que ser doble pareja
						System.out.print(j.getNombre()+" tiene doble pareja");
						numDescarte = 1;
					}break;
					
			case 2:System.out.println(j.getNombre()+" tiene poker o fill");
					numDescarte = 0;
					break;
			default: break;
		}	

	}
	
	

	private static boolean isTrio(TreeMap<Integer, Integer> map) {
		for (Map.Entry m:map.entrySet()) {
			int valor =(int)m.getValue();
	          if(valor == 3) {
	        	  return true;      	 
	          }
		}
		return false;
	}



	private static boolean isEscalera(TreeMap<Integer, Integer> map) {
		int primeroNumero = map.firstKey();
		int ultimoNumero = map.lastKey();
		return (ultimoNumero-primeroNumero)== 4;
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
