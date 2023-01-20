package curso.s2.herencia;

public class Cliente extends Persona {
	 private int numeroCliente;
	 private String fechaAlta;
	
	public void verFechaAlta() {
		System.out.println("Fecha de Alta :");

	}

	@Override
	String aString() {
		// TODO Auto-generated method stub
		return "Cliente" ;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
}
