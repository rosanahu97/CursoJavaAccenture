package curso.s3.comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClienteRF {
	public static final String DIRECCION = "recursosformacion.com";
	public static final int PUERTO = 80;
	
	public static void main(String[] args) throws IOException {
		//crear socket cliente con el puerto y la direccion
		System.out.println("Conectando a "+DIRECCION+"por puerto "+PUERTO);
		Socket cliente = new Socket(DIRECCION,PUERTO);
		System.out.println("Conectando a "+cliente.getRemoteSocketAddress());
		//escritura
		OutputStream outToServer =cliente.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("Saludo desde "+cliente.getLocalPort());
		//lectura
		
		InputStream inFromServer = cliente.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		
		while(in.read()!=-1) {
			System.out.println("Me ha contestado "+in.read());
		}
		//cliente.close();
		}
		//cerrar el socket
		
	
}
