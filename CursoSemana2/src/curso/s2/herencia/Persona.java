package curso.s2.herencia;

public abstract class Persona {
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	abstract String aString();
	public void crear() {
		System.out.println("Persona creada");
	}
	public void borrar() {
		System.out.println("Persona borrada");

	}
	public void enviarMensaje() {
		System.out.println("Mensaje enviado desde"+nombre);

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
}
