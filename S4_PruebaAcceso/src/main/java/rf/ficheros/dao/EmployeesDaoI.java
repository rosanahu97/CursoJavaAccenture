package rf.ficheros.dao;

import java.util.List;

import rf.ficheros.modelos.Employees;

public interface EmployeesDaoI {
	public Employees leerUno(String employees_id);
	public List<Employees> leerTodos();
	//devolver n de la fila actualizada
	public int actualizar(Employees employee);
	//devolve n de la fila eliminada
	public int delete(Employees employee);
	
	public int delete(String employees_id);
	
	public Employees insert(Employees employee);
}
