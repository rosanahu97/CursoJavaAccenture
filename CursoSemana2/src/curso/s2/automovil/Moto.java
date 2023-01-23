package curso.s2.automovil;

public class Moto extends Auto {

	
	private int deposito;
	
	
	public Moto(int numMarchas, int velocidadMaxima, int numChasis, int numRuedas,
			int dep) {
		super(numMarchas, velocidadMaxima, numChasis, numRuedas);
		setDeposito(dep);
	}



	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}



	@Override
	public String toString() {
		return "El moto: "+super.toString()+" [deposito=" + deposito + "]";
	}
	
	
	
}
