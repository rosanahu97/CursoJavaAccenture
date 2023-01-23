package curso.s2.herenciaEquipos;

public class Futbolista extends Equipo {
	
	private int dorsal;
	private String demarcacion;
	

	public Futbolista(int i, String n, String ap, int e,int dor,String dem) {
		super(i, n, ap, e);
		setDorsal(dor);
		setDemarcacion(dem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void concentrarse() {
		System.out.println("El futbolista " + getNombre()+" esta concentrando");
		
	}

	@Override
	public void viajar() {
		System.out.println("El futbolista " + getNombre()+" esta viajando");

		
	}
	
	public void jugarPartido() {
		System.out.println("El futbolista " + getNombre()+" esta jugando");

	}
	
	public void entrenar () {
		System.out.println("El futbolista " + getNombre()+" esta entrenando");

	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	
	

}
