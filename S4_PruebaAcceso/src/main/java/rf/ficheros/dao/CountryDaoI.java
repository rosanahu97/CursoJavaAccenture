package rf.ficheros.dao;

import java.sql.SQLException;
import java.util.List;

import rf.ficheros.modelos.Country;

public interface CountryDaoI {
	
	public Country leerUno(String country_id)throws SQLException;
	public List<Country> leerTodos() throws SQLException;
	//devolver n de la fila actualizada
	public int actualizar(Country country) throws SQLException;
	//devolve n de la fila eliminada
	public int delete(Country country) throws SQLException;
	
	public int delete(String country_id) throws SQLException;
	
	public Country insert(Country country) throws SQLException;
	
}
