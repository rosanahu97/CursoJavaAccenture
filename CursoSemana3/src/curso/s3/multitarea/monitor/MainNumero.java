package curso.s3.multitarea.monitor;

public class MainNumero {
	
	static Buffer buf;

	public static void main(String[] args) {
		buf = new Buffer();
		buf.setDisponible(false);
		
		GenerarNumero gn= new GenerarNumero();
		gn.setBuf(buf);
		PresentaNumero pn= new PresentaNumero();
		pn.setBuf(buf);
		
		Thread tgn = new Thread(gn);
		Thread tpn = new Thread(pn);
		
		tgn.start();
		tpn.start();
		
	}
}
