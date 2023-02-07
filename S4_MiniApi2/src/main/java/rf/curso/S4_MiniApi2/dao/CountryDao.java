package rf.curso.S4_MiniApi2.dao;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import rf.curso.S4_MiniApi2.modelos.Categoria;
import rf.curso.S4_MiniApi2.modelos.Country;
import rf.curso.S4_MiniApi2.servicios.JPAUtil;


public class CountryDao {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar coutriy
	public void guardar(Country coutriy) {
		manager.getTransaction().begin();
		manager.persist(coutriy);
		manager.getTransaction().commit();		
	}

	// editar coutriy
	public void editar(Country coutriy){
		manager.getTransaction().begin();
		manager.merge(coutriy);
		manager.getTransaction().commit();
	}

	// buscar coutriy
	public Country buscar(String id) {
		
		Country c = manager.find(Country.class, id);
		return c;
	}

	/// eliminar coutriy
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}
	
	public void eliminar(Country country) {
		eliminar(country.getCountry_id());
	}

	// obtener todos los coutriy
	public List<Country> obtenerCounties() {
		List<Country> listaCountries = new ArrayList<Country>();
		Query q = manager.createQuery("SELECT c FROM Country c");
		listaCountries = (List<Country>) q.getResultList();
		return listaCountries;
	}
}
