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
		System.out.println("***********Analizar los jugadores**********");
		analizarJugador(jugadores);
		//visualizar los jugadores despues del descarte
		System.out.println("***********Visualizar los jugadores despues del descarte**********");
		visualizar(jugadores);
		
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
		int numDescarte;
		//analizamos que numero y que palo tienen el juegador 
		TreeMap<Integer,Integer> map1_numero = new TreeMap<Integer,Integer>();
		TreeMap<String,Integer> map2_palo = new TreeMap<String,Integer>();
			
		
		//almacenamos en clave el numero de la carta y en valor el numero de repeticiones.
		for(Carta c :cartas) {
			if(map1_numero.get(c.getNumero())==null) {
				map1_numero.put(c.getNumero(), 1);
			}else {
				int res =map1_numero.get(c.getNumero());
				map1_numero.put(c.getNumero(), ++res);
			}
		}
		//almacenamos en clave el palo de la carta y en valor el numero de repeticiones.
		for(Carta c :cartas) {
			if(map2_palo.get(c.getPalo())==null) {
				map2_palo.put(c.getPalo(), 1);
			}else {
				int res =map2_palo.get(c.getPalo());
				map2_palo.put(c.getPalo(), ++res);
			}
		}
		//analizamos las cartas que tiene en la mano
		switch(map1_numero.size()) {
			//cuando tiene 5 carta diferentes
			case 5: if(map2_palo.size()==1 && isEscalera(map1_numero)) {
						System.out.println(j.getNombre()+" tiene escalera real o de color");
					}else if(isEscalera(map1_numero)) {
						System.out.println(j.getNombre()+" tiene escalera");
					}else {
						numDescarte =5;
						System.out.println("------Descartes "+j.getNombre()+" ------");
						descarte(j,numDescarte,map1_numero);
					}break;
			//cuando tiene 4 carta diferentes
			case 4:	System.out.println(j.getNombre()+" tiene una pareja");
					numDescarte = 3;
					System.out.println("------Descartes "+j.getNombre()+" ------");
					descarte(j,numDescarte,map1_numero);
					break;
			//cuando tiene 3 carta diferentes
			case 3:	if(isTrio(map1_numero)) {
						System.out.print(j.getNombre()+" tiene trio ");
						numDescarte = 2;
						System.out.println("------Descartes "+j.getNombre()+" ------");
						descarte(j,numDescarte,map1_numero);
					}else {
						//si no es trio,entonces tiene que ser doble pareja
						System.out.println(j.getNombre()+" tiene doble pareja");
						numDescarte = 1;
						System.out.println("------Descartes "+j.getNombre()+" ------");
						descarte(j,numDescarte,map1_numero);
					}break;
			//cuando tiene 2 carta diferentes		
			case 2:System.out.println(j.getNombre()+" tiene poker o fill");
					numDescarte = 0;
					break;
			//no deberia existir otros casos, seria un error
			default: System.out.println("Error");break;
		}	

	}
	
	/**
	 * Metodo para descartar cartas
	 * @param j jugador
	 * @param num numero de descarte
	 * @param map almacena el numero de cartas que tiene y su repeticion 
	 * 
	*/

	private static void descarte(Jugador j, int num, TreeMap<Integer, Integer> map) {
		
		Iterator<Carta> itCarta = cartas.iterator();
		Set<Carta> cartaMano = j.getMano();
		
		switch(num) {
			//eliminar todas las cartas de la mano
			case 5: System.out.println("El jugador "+j.getNombre()+" ha decidido descartar todas las cartas  ");
					j.setMano(new HashSet<>());
					repartirCarta(itCarta, j, 5);break;
			//tengo una pareja en la mano

			case 3:	eliminarCartas(cartaMano,map,2);			
					repartirCarta(itCarta, j, 3);break;				
			
			//tengo un trio en la mano
			case 2:	eliminarCartas(cartaMano,map,3);
					repartirCarta(itCarta, j, 2);break;
			
			//tengo un doble pareje en la mano
			case 1: eliminarCartas(cartaMano,map,2);
					repartirCarta(itCarta, j, 1);break;
			
			default:break;
		}
		
	}
	/**
	 * Metodo para descartar las cartas que tiene en la mano
	 * @param cartaMano las cartas que tiene en la mano
	 * @param repeticion el numero de repeticiones
	 * @param map almacena el numero de carta  y su repeticion 
	 * 
	*/

	private static void eliminarCartas(Set<Carta> cartaMano, TreeMap<Integer, Integer> map, int repeticion) {
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {	
			if(entry.getValue()<repeticion) {
				Carta cartaAEliminar =encontrarCarta(entry.getKey(),cartaMano);
				cartaMano.remove(cartaAEliminar);
				System.out.println(cartaAEliminar.toString());
			}
		}
		
	}

	/**
	 * Metodo para encontrar una carta concreta sabiendo su numero
	 * @param value el numero de la carta
	 * @param cartaMano las cartas que tiene el jugador
	 *@return devuelve la carta encontrada
	 * */
	private static Carta encontrarCarta(Integer value, Set<Carta> cartaMano) {
		boolean encontrado = false;
		Carta res = new Carta();
		
			for (Iterator<Carta> it = cartaMano.iterator(); it.hasNext()&&!encontrado; ) {
		       Carta c = it.next();
		        if (c.getNumero() == value) {
		        	res = c;
		        	encontrado=true;
		        }
		    }		
		return res;
	}

	/**
	 * Metodo para comprobar si el jugador tiene trio en la mano o no 
	 * @param map el numero que tiene en la mano
	 * @return true si el jugador tiene un trio en la mano false en caso contrario
	 * */
	private static boolean isTrio(TreeMap<Integer, Integer> map) {
		for (Map.Entry m:map.entrySet()) {
			int valor =(int)m.getValue();
	          if(valor == 3) {
	        	  return true;      	 
	          }
		}
		return false;
	}

	/**
	 * Metodo para comprobar si el jugador tiene escalera en la mano o no 
	 * @param map el numero que tiene en la mano
	 * @return true si el jugador tiene una escalera en la mano false en caso contrario
	 * */

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
	 * Metodo para repartir las cartas a los jugadores 
	 * @param jug el conjunto jugadores
	 * @param car el conjunto cartas
	 */
	private static void repartirCartas(Set<Carta> car, Set<Jugador> jug) {
		Iterator<Carta> itCarta = car.iterator();
		for(int i =0;i<CARTAS;i++) {
			for(Iterator<Jugador> itJugador = jug.iterator(); itJugador.hasNext();) {
				if(itCarta.hasNext()) {
					repartirCarta(itCarta,itJugador.next(),1);

				}else {
					System.out.println("Carta vacia");
				}
			}
				
		}
	}
	/**
	 * Metodo para repartir determinado numero de cartas 
	 * @param jug el jugadores que va a recibir la carta
	 * @param i determina cuantas cartas va a recibir
	 * @param itCarta iterador de la carta 
	 */
	private static void repartirCarta(Iterator<Carta> itCarta, Jugador jug, int i) {
		int contador=0;
		Set<Carta> cartaMano = jug.getMano();
		
		while(itCarta.hasNext()&& contador<i) {
			cartaMano.add(itCarta.next());
			itCarta.remove();
			contador++;
		}
		jug.setMano(cartaMano);
		
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
