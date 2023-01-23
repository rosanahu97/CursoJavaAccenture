package curso.s2.ejercicioPersona;

import java.util.ArrayList;
import java.util.Set;

public class Alumno extends Persona{
	//definir las variables, guardamos las asignaturas en un arraylist
	private int curso;
	private ArrayList<String> asignaturas;
	

	public Alumno(String codPersona, String nombre, int edad, String telContacto,
					int curso) {
		super(codPersona, nombre, edad, telContacto);
		this.setCurso(curso);
		asignaturas = new ArrayList<String>();
		

	}

	//metodo para mostrar las informaciones de un alumno
	@Override
	void mostrar() {
		System.out.println("El alumno esta en "+curso+" curso con las asignaturas"+asignaturas.toString());
		
	}

	//añadimos la asginatura a la lista
	public void setAsignatura(String ag) {
		asignaturas.add(ag);
		
		
	}
	public int getCurso() {
		return curso;
	}


	public void setCurso(int curso) {
		this.curso = curso;
	}


	public ArrayList<String> getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(ArrayList<String> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
	

}
