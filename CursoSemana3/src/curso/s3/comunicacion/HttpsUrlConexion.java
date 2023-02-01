package curso.s3.comunicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map.Entry;

public class HttpsUrlConexion {

	public static void main(String[] args)  {
		URL rfURL;
		BufferedReader in =null;
		try {
			rfURL = new URL("https://www.recursosformacion.com");
			HttpURLConnection conexion = (HttpURLConnection) rfURL.openConnection();
			conexion.addRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
			in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			//System.out.println(in.readLine());
			
			for(Entry<String, List<String>> header : conexion.getHeaderFields().entrySet()) {
				System.out.println(header.getKey()+ " = "+header.getValue());;
			}
			
			
			
			
			conexion.disconnect();
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
