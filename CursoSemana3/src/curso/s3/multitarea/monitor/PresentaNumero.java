package curso.s3.multitarea.monitor;

import java.util.Random;

public class PresentaNumero implements Runnable {
	private Buffer buffer;
	public void setBuf(Buffer buf) {
		buffer = buf;
	}
	@Override
	public void run() {
		while(true) {
			synchronized(buffer){
				while(!buffer.isDisponible()) {
					System.out.println("Esperando numero....");
					try {
						//no esta el numero, me espero
						buffer.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				//generar el numero y avisar a los demas la disponibilidad
				System.out.println("Numero:"+buffer.getNumero());
				buffer.setDisponible(false);
				buffer.notifyAll();
			}
		}
	}
}
