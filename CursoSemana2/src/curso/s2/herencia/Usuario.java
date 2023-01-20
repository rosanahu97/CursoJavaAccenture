package curso.s2.herencia;

public class Usuario extends Persona {
	private double codigoUsuario;
	
	public void autorizado() {
		System.out.println("Usuario autorizado");

	}
	public void crear() {
		System.out.println("Usuario creado");

	}
	@Override
	String aString() {
		// TODO Auto-generated method stub
		return null;
	}

}
