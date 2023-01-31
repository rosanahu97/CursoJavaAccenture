package curso.s3.multitarea.monitor;

import java.util.Random;

public class GenerarNumero implements Runnable {
	private Buffer buffer;
	public void setBuf(Buffer buf) {
		buffer = buf;
	}
	@Override
	public void run() {
		Random rm = new Random();
		while(true) {
					
				buffer.setNumero(rm.nextInt());;
				
		}
	}
	
	
	
	
	
	
	
}
