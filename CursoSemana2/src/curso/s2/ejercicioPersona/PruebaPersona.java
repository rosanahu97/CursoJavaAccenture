package curso.s2.ejercicioPersona;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Alumno p1 = new Alumno("al100", "Pepe", 15, "123455", 2);
		//insertar asignaturas
		p1.setAsignatura("Lengua");
		p1.setAsignatura("Matematicas");
		p1.mostrar();

		Persona p2 = new Profesor("pf100", "Paco", 50, "6543211", 1500, "10/02/2022");
		p2.mostrar();
	}

}
