package rf.curso.S4_MiniApi2;

import java.sql.SQLException;
import java.util.List;

import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.Country;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws SQLException {
		CountryController cc = new CountryController();
		List<Country> lc =cc.leerTodos();
		System.out.println("-----Encontrar un pais por su id-----");
		Country res = cc.leerUno("MX");

		System.out.println("-----Listar todos los paises-----");
		listarCtr(lc);
		System.out.println("-----Actualizar pais -----");
		Country a1 = new Country();
		a1.setCountry_id("MX");
		a1.setCountry_name("MEXICO");
		a1.setRegion_id(15);
		cc.actualizar(a1);

		System.out.println("-----Eliminar un pais -----");
		Country a2 = new Country();
		a2.setCountry_id("RH");
		a2.setCountry_name("Prueba insertar");
		a2.setRegion_id(10);	
		cc.delete(a2);
		System.out.println("-----Eliminar un pais por id-----");
		cc.delete("ZW");
		System.out.println("-----Insertar un pais -----");
		Country i1=new Country();
		i1.setCountry_id("RH");
		i1.setCountry_name("Prueba insertar");
		i1.setRegion_id(10);
		cc.insert(i1);
		
	}
	public static void listarCtr(List<Country> lc) {
		lc.stream().forEach(System.out::println);
		
	}
}
