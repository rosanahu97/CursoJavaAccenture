package curso.s3.juegoCartas;

public class Carta {
	private int numero;
	private String palo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		switch(numero) {
		case 11: return "Carta [numero=J" + ", palo=" + palo + "]";
		case 12: return "Carta [numero=Q" + ", palo=" + palo + "]";
		case 13: return "Carta [numero=K" + ", palo=" + palo + "]";
		case 1 : return "Carta [numero=As" + ", palo=" + palo + "]";
		default :return "Carta [numero=" + numero + ", palo=" + palo + "]";
		}
		
		
		
	}
	
	
	
}
