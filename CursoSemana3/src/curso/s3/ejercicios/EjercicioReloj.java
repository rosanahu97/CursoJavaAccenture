package curso.s3.ejercicios;

public class EjercicioReloj {

	public static void main(String[] args) throws InterruptedException {
		String tiempo = "";
		for(int i =0;i<60;i++) {
			for(int j=0;j<60;j++) {
				for(int t =0;t<60;t++) {
					tiempo = String.format("%02d : %02d : %02d",i,j,t);
					System.out.println(tiempo.toString());
					Thread.sleep(1000);
				}
			}
		}

	}

}
