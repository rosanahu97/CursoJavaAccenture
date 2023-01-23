package curso.s2.herenciaEquipos;

public class Entrenador extends Equipo {

	private String idFederacion;
	
	
	public Entrenador(int i, String n, String ap, int e,String idF) {
		super(i, n, ap, e);
		setIdFederacion(idF);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void concentrarse() {
		System.out.println("El entrenador " + getNombre()+" esta concentrado");

		
	}

	@Override
	public void viajar() {
		System.out.println("El entrenador " + getNombre()+" esta viajando");

		
	}
	
	public void dirigirPartido() {
		System.out.println("El entrenador " + getNombre()+" esta dirigiendo el partido");

	}
	
	public void dirigirEntrenamiento() {
		System.out.println("El entrenador " + getNombre()+" esta dirigiendo el entrenamiento");

	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	
	

}
