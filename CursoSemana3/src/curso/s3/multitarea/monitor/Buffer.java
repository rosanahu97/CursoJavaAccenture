package curso.s3.multitarea.monitor;

import java.util.Random;

public class Buffer {
	private boolean disponible;
	private int numero;
	
	public boolean isDisponible() {
		return disponible;
	}

	public synchronized int getNumero() {
		
		while(!isDisponible()) {
			try {
				System.out.println("Esperando----");
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setDisponible(false);
		this.notifyAll();
	return numero;
	}

	public synchronized void setNumero(int numero) {
		while(this.isDisponible()) {
			System.out.println("Esperando espacio....");
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		this.numero = numero;
		this.setDisponible(true);
		this.notifyAll();
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
