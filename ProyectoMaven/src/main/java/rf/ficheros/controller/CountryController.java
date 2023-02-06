package rf.ficheros.controller;

import java.sql.SQLException;
import java.util.List;

import rf.ficheros.dao.CountryDao;
import rf.ficheros.modelos.Country;

public class CountryController {

	CountryDao cDao;
	
	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
	
	public List<Country> leerTodos() throws SQLException {
		return cDao.leerTodos();
	
	}
	public Country leerUno(String id) throws SQLException {
		return cDao.leerUno(id);
	
	}

	public int actualizar(Country country) throws SQLException{
		return cDao.actualizar(country);
	}
	public int delete(Country country) throws SQLException{
		return cDao.delete(country);
	}
	
	public int delete(String country_id) throws SQLException{
		return cDao.delete(country_id);
	}
	
	public Country insert(Country country) throws SQLException{
		return cDao.insert(country);
	}
	
	
}
