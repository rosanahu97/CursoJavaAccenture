package rf.ficheros.modelos;

public class Country {
	private String country_id;//cuando es un atributo cty_id
	private String country_name;
	private int region_id;//cuando es un foreign key, el nombre de la table+id
	
	
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int i) {
		this.region_id = i;
	}
	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + ", region_id=" + region_id
				+ "]";
	}
	
	
	
	
}
