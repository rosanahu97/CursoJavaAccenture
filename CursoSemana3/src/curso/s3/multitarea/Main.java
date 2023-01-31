package curso.s3.multitarea;

public class Main {

	public static void main(String[] args) {
		Mensaje m1 = new Mensaje();
		Mensaje m2 = new Mensaje();	
		m1.setMensaje("Este mensaje es desde 1");
		m2.setMensaje("Este mensaje es desde 2");
		
		m1.start();
		m2.start();
		
		m2.setMensaje("*********************");
	}

}
