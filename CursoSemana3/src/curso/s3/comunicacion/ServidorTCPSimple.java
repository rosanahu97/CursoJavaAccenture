package curso.s3.comunicacion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {
	
	public static final String SALUDO = "Servidor esperando en puerto: ";
	public static final int TIMEOUT =10000;
	public static final int PUERTO = 6000;
	
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) throws IOException  {
		//abrir el servidor con puerto 6000
		serverSocket = new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);
		
		while(true) {
			
			try {
				System.out.println(SALUDO+serverSocket.getLocalPort()+" ...");
				//el servidor se queda en estado de listening
				Socket server = serverSocket.accept();
				System.out.println("Conexion desde "+server.getRemoteSocketAddress());
				//lectura  
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				//escritura
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Gracias por conectarte a "+server.getLocalSocketAddress());
				//cierra el socket, dejar el puesto libre
				server.close();
				break;
			}catch(SocketTimeoutException s) {
				System.out.println("Socket timed out!");
			}catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
		
		

	}

}
