package curso.s2.banco.pruebas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import curso.s2.banco.Credito;
import curso.s2.banco.Cuenta;
import curso.s2.banco.Debito;
import curso.s2.banco.util.FiltroCastellano;
import curso.s2.banco.util.Filtros;
import curso.s2.banco.util.ListarMovimientos;

public class PruebaBanco {
	private static Cuenta miCuenta;
	private static Debito tDebito;
	private static Credito tCredito;
	private static Filtros filtro;
	
	public static void main(String[] args) throws Exception {
		//crea dos objetos distintos(debito y credito) para hacer la prueba
		filtro = new FiltroCastellano();
		miCuenta = new Cuenta("B12345", "Cliente 1",filtro);
	
		miCuenta.ingresar(500);
		tDebito= new Debito(LocalDate.now().plusYears(4), "C1234566789", "Cliente 1");
		tDebito.setmCuentaAsociada(miCuenta);
		tDebito.ingresar(100);
		tDebito.retirar(200);
		
		ListarMovimientos.verMovimientos(miCuenta.getmMovimientos());
		
		
		tCredito = new Credito(LocalDate.now().plusYears(4), "C987654321", "Cliente 1");
		tCredito.setmCuentaAsociada(miCuenta);
		tCredito.ingresar(1000);
		tCredito.retirar(200);
		tCredito.pagoEnEstablecimiento("Zara", 50);
		System.out.println("Movimientos en tarjeta credito------------");
		ListarMovimientos.verMovimientos(tCredito.getmMovimiento());

		tCredito.liquidar(LocalDate.now().getMonthValue(), LocalDate.now().getYear());
		
	
		ListarMovimientos.verMovimientos(miCuenta.getmMovimientos());

	}
	
	

}
