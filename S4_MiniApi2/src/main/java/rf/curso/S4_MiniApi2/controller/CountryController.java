package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;
import java.util.List;

import rf.curso.S4_MiniApi2.dao.CountryDao;
import rf.curso.S4_MiniApi2.modelos.Country;

public class CountryController {

	CountryDao cDao;

	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}

	public List<Country> leerTodos() throws SQLException {
		return cDao.obtenerCounties();

	}

	public Country leerUno(String id) throws SQLException {
		return cDao.buscar(id);

	}

	public void actualizar(Country country) throws SQLException {
		cDao.editar(country);
	}

	public void delete(Country country) throws SQLException {
		cDao.eliminar(country);
	}

	public void delete(String country_id) throws SQLException {
		cDao.eliminar(country_id);
	}

	public void insert(Country country) throws SQLException {
		cDao.guardar(country);
	}

}
