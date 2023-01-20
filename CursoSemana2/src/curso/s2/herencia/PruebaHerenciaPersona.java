package curso.s2.herencia;

public class PruebaHerenciaPersona {

	public static void main(String[] args) {
		//la clase cliente hereda de la clase persona
		Persona p1 = new Cliente();
		p1.setNombre("Yuqian");
		p1.setDireccion("Avenida Juan XXIII");
		p1.setCorreoElectronico("yuqian@gmail.com");
		p1.crear();
		Usuario u1 = new Usuario();
		u1.setNombre("Usuario 1");
		u1.autorizado();
		Cliente c1 = new Cliente();
		c1.setNombre("Cliente 1");
		c1.setFechaAlta("20/01/2023");
		c1.crear();
		ClienteExportacion ce= new ClienteExportacion("yuqian","rosana","donde","12345");
		System.out.println("El cliente exportacion "+ce.getNombre()+" con vat "+ce.getVat().toString());
				

	}

}
