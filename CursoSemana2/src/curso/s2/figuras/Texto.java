package curso.s2.figuras;

public class Texto {

	private String titulo;
	private String descripcion;
	
	
	public Texto(String titulo, String descripcion) {
		super();
		setTitulo(titulo);
		setDescripcion(descripcion);
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
