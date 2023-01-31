package curso.s3.juegoCartas;

import java.util.HashSet;
import java.util.Set;

public class Paquete {
	private Set<Carta> cartas = new HashSet<>();
	static final String POKER="POKER";
	static final String BARAJA="BARAJA";
	static final String[] PALOS_ESPAÑOLA = {"oro","copa","espada","basto"};
	static final String[] PALOS_POKER = {"corazones","diamantes","trebol","picas"};
	
	
	public Paquete (String tipo) {
		if(tipo.equals(POKER)) {
			crearCartas(PALOS_POKER);
		}else if(tipo.equals(BARAJA)) {
			crearCartas(PALOS_ESPAÑOLA);
		}else {
			System.out.println("Tipo incorrecto");
		}
		
	}
	
	/**
	 * Metodo para generar las cartas 
	 */
	public void crearCartas(String[] palos) {
		for(int i =0;i<palos.length;i++) {
			for(int j=1;j<13;j++) {
				Carta c = new Carta();
				c.setNumero(j);
				c.setPalo(palos[i]);
				cartas.add(c);
			}
		}
	}
	/**
	 * Metodo para mostrar las cartas,
	 * imprimir por la pantalla las cartas creadas
	 */
	public void mostarCartas() {
		cartas.forEach(c->System.out.println(c.toString()));
	}
	public Set<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(Set<Carta> cartas) {
		this.cartas = cartas;
	}
	
	
	
}
