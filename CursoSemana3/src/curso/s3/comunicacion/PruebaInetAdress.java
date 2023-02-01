package curso.s3.comunicacion;

import java.net.InetAddress;

public class PruebaInetAdress {

	public static void main(String[] args) {
		try {
			//IP web(por dominio)
			InetAddress ip = InetAddress.getByName("recursosformacion.com");
			//IP local
			InetAddress ipMio = InetAddress.getLocalHost();
			//mostrar la informacion por consola
			System.out.println("IP web :"+ip.getHostAddress());
			System.out.println("IP web nombre :"+ip.getHostName());
			
			System.out.println("IP local :"+ipMio.getHostAddress());
			System.out.println("IP local nombre :"+ipMio.getHostName());

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
