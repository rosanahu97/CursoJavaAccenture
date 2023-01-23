package curso.s2.herenciaEquipos;

public class Masajista extends Equipo {

	
	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista(int i, String n, String ap, int e,String ti,int anyo) {
		
		super(i, n, ap, e);
		setAniosExperiencia(anyo);
		setTitulacion(ti);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void concentrarse() {
		System.out.println("El masajista " + getNombre()+" esta concentrando");

		
	}

	@Override
	public void viajar() {
		System.out.println("El masajista " + getNombre()+" esta viajando");

		
	}
	
	public void darMasaje() {
		System.out.println("El masajista " + getNombre()+" esta dando el masaje");

	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	

	
	
	
	
}
