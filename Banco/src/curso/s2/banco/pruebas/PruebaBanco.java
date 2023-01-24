package curso.s2.banco.pruebas;

import java.time.LocalDate;

import curso.s2.banco.Credito;
import curso.s2.banco.Cuenta;
import curso.s2.banco.Debito;

public class PruebaBanco {
	private static Cuenta miCuenta;
	private static Debito tDebito;
	private static Credito tCredito;
	
	public static void main(String[] args) throws Exception {
		//crea dos objetos distintos(debito y credito) para hacer la prueba
		miCuenta = new Cuenta("B12345", "Cliente 1");
		/*
		miCuenta.ingresar(500);
		tDebito= new Debito(LocalDate.now(), "C1234566789", "Cliente 1");
		tDebito.setmCuentaAsociada(miCuenta);
		tDebito.ingresar(100);
		tDebito.retirar(200);
		System.out.println(miCuenta.toString());
		System.out.println("El saldo actual de la cuenta es: "+miCuenta.getSaldo());
		*/
		miCuenta.ingresar(500);
		tCredito = new Credito(LocalDate.now(), "C987654321", "Cliente 1");
		tCredito.setmCuentaAsociada(miCuenta);
		tCredito.ingresar(1000);
		tCredito.retirar(200);
		tCredito.pagoEnEstablecimiento("Zara", 50);

		tCredito.liquidar(LocalDate.now().getMonthValue(), LocalDate.now().getYear());
		
		System.out.println(miCuenta.toString());
		System.out.println(tCredito.getmMovimiento().toString());
		

		

	}

}
