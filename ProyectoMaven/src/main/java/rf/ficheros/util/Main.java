package rf.ficheros.util;

import java.sql.SQLException;
import java.util.List;

import javax.print.attribute.SetOfIntegerSyntax;

import rf.ficheros.controller.CountryController;
import rf.ficheros.modelos.Country;

public class Main {

	public static void main(String[] args) throws SQLException {
		CountryController cc = new CountryController();
		List<Country> lc =cc.leerTodos();
		System.out.println("-----Encontrar un pais por su id-----");
		Country res = cc.leerUno("MX");
		System.out.println(res.toString());
		System.out.println("-----Listar todos los paises-----");
		listarCtr(lc);
		System.out.println("-----Actualizar pais -----");
		Country a1 = new Country();
		a1.setCountry_id("MX");
		a1.setCountry_name("MEXICO");
		a1.setRegion_id(15);
		int act1=cc.actualizar(a1);
		System.out.println("fila actualizado:"+act1);
	
		System.out.println("-----Eliminar un pais -----");
		Country a2 = new Country();
		a2.setCountry_id("BE");
		a2.setCountry_name("Belgium");
		a2.setRegion_id(1);	
		int del1 =cc.delete(a2);
		System.out.println("fila eliminada: "+del1);
		System.out.println("-----Eliminar un pais por id-----");
		int del2 =cc.delete("DK");
		System.out.println("fila eliminada: "+del2);	
		System.out.println("-----Insertar un pais -----");
		Country i1=new Country();
		i1=cc.insert(a1);
		System.out.println(i1.toString());



		
		
		

	}
	public static void listarCtr(List<Country> lc) {
		lc.stream().forEach(System.out::println);
		
	}
}
