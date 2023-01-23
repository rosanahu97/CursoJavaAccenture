package curso.s2.herenciaEquipos;

public abstract class Equipo {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Equipo(int i,String n,String ap,int e) {
		setId(i);
		setNombre(n);
		setApellidos(ap);
		setEdad(e);
		
	}
//metodos comunes 
	public abstract void concentrarse();
	public abstract void viajar();
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
