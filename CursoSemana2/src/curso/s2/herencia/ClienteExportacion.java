package curso.s2.herencia;

public class ClienteExportacion extends Cliente{
	private String vat;
	
	public ClienteExportacion(String n,String d,String c,String v){
		super();
		this.setNombre(n);
		this.setDireccion(d);
		this.setCorreoElectronico(c);
		this.setVat(v);
		
	}

	public void setVat(String v) {
		this.vat=v;
		
	}

	public String getVat() {
		return vat;
	}
}
