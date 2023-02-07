package rf.ficheros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.ficheros.modelos.Country;
import rf.ficheros.util.OracleJDBC;

public class CountryDao implements CountryDaoI{
	public final static String SQL_LEER_TODOS_PAIS = "select * from countries";
	public final static String SQL_LEER_UN_PAIS = "select * from countries where country_id = ";
	public final static String SQL_ACTUALIZAR_PAIS = "update countries_rh set country_name = ?,region_id=? where country_id = ?";
	public final static String SQL_ELIMINAR_PAIS = "delete from countries_rh where country_id = ?";
	public final static String SQL_INSERT_PAIS = "insert into countries_rh (country_id,country_name,region_id)values(?,?,?)";

	private Connection conexion;
	
	public CountryDao() throws SQLException {
		OracleJDBC ora = new OracleJDBC();
		conexion = ora.abrirConexion();
	}
	
	
	public Country leerUno(String country_id) throws SQLException {
		ResultSet rs = null;
		Country salida = new Country();
		try {
			Statement stm = conexion.createStatement();
			rs = stm.executeQuery(SQL_LEER_UN_PAIS+"'"+country_id+"'");
			rs.next();			
			salida = cargarPais(rs);
			
			
		} catch (SQLException e) {
			System.out.println(SQL_LEER_TODOS_PAIS + " " + e.getMessage());
		}
	return salida; 
	}


	public List<Country> leerTodos() throws SQLException  {
		ResultSet rs = null;
		List<Country> salida = new ArrayList<Country>();
		try {
			Statement stm = conexion.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS_PAIS);
			while (rs.next()) {
				salida.add(cargarPais(rs));
			}
			
		} catch (SQLException e) {
			System.out.println(SQL_LEER_TODOS_PAIS + " " + e.getMessage());
		} finally {

			if (rs != null) {
				rs.close();
			}
		}
		return salida;
	}

	
	
	
	private Country cargarPais(ResultSet rs) throws SQLException {
		Country ctr = new Country();
		ctr.setCountry_id(rs.getString("country_id"));
		ctr.setCountry_name(rs.getString("country_name"));
		ctr.setRegion_id(rs.getInt("region_id"));
		return ctr;
	}


	public int actualizar(Country country) throws SQLException {
		PreparedStatement ps = conexion.prepareStatement(SQL_ACTUALIZAR_PAIS);
		ps.setString(1, country.getCountry_name());
		ps.setInt(2, country.getRegion_id());
		ps.setString(3, country.getCountry_id());
		System.out.println(ps.getParameterMetaData().toString());

		return ps.executeUpdate();
	}

	public int delete(Country country) throws SQLException {
		return delete(country.getCountry_id());
	}

	public int delete(String country_id) throws SQLException {
		PreparedStatement ps = conexion.prepareStatement(SQL_ELIMINAR_PAIS);
		ps.setString(1, country_id);		
		return ps.executeUpdate();
	}

	public Country insert(Country country) throws SQLException {
		PreparedStatement ps = conexion.prepareStatement(SQL_INSERT_PAIS);
		ps.setString(1, country.getCountry_id());
		ps.setString(2, country.getCountry_name());
		ps.setInt(3, country.getRegion_id());
		
		return leerUno(country.getCountry_id());
	}

}
