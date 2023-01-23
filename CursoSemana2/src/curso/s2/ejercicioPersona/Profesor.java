package curso.s2.ejercicioPersona;

public class Profesor extends Persona{
	//definir las variables	
	private float salario;
	private String fecContratacion;
	
	
	public Profesor(String codPersona, String nombre, int edad, String telContacto,
					float salario,String fecContratacion) {
		super(codPersona, nombre, edad, telContacto);
		setSalario(salario);
		setFecContratacion(fecContratacion);
	}
	//metodo para mostrar las informaciones
	@Override
	void mostrar() {
		System.out.println("El salario del profesor es "+this.getSalario()+
				" y su fecha de contratacion es : "+this.getFecContratacion());

		
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFecContratacion() {
		return fecContratacion;
	}

	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}

	
}
