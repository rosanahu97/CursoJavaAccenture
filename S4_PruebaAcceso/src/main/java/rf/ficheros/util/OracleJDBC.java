package rf.ficheros.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rf.ficheros.modelos.Country;

public class OracleJDBC {
	private static Connection conexion;
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
	public final static String DATABASE = "";
	public final static String USUARIO = "hr";
	public final static String PASSWORD = "hr";
	public final static String SQL_LEER_TODOS = "select * from employees";
	public final static String SQL_LEER_TODOS_PAIS = "select * from countries";

	public Connection abrirConexion() throws SQLException {
		try {
			Class.forName(JDBC_DRIVER);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		System.out.println("Oracle JDBC Driver registered");
		conexion = null;
		try {
			conexion = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
			System.out.println("Conexion establecido");

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		conexion.setAutoCommit(false);
		return conexion;
		
	}
	
	public void cerrarConexion() throws SQLException {
		if (conexion != null) {
			System.out.println("Conexion establecido");
			conexion.rollback();
			conexion.close();
		} else {
			System.out.println("Conexion fallado");
		}
	}
		
	
	public static void lecturaEmpleado() throws SQLException {
		ResultSet rs = null;
		try {
			Statement stm = conexion.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS);
			while (rs.next()) {
				System.out.println(rs.getString("first_name")+" "+rs.getString("last_name"));
			}
		} catch (SQLException e) {
			System.out.println(SQL_LEER_TODOS + " " + e.getMessage());
		} finally {

			if (rs != null) {
				rs.close();
			}
		}
	}
	
	

}
