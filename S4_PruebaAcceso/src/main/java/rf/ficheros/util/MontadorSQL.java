package rf.ficheros.util;

public class MontadorSQL {

	public static String addSalida(String salida, String nombreCampo, int valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, valor + "", separador);
	}

	public static String addSalida(String salida, String nombreCampo, long valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, valor + "", separador);
	}

	public static String addSalida(String salida, String nombreCampo, double valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, valor + "", separador);
	}

	public static String addSalida(String salida, String nombreCampo, String valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);
	}

	public static String addSalidaSencilla(String salida, String nombreCampo, String valor, String separador) {

		StringBuilder sb = new StringBuilder();
		sb.append(salida);
		if (sb.length()>0) {
			sb.append(separador + " ");
		}
		if (!nombreCampo.equals("") && nombreCampo != null) {
			sb.append(nombreCampo + "=" + valor);
		} else {
			sb.append(valor);
		}
		return sb.toString();
	}

}
