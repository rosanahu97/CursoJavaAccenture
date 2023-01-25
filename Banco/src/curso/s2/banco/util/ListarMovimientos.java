package curso.s2.banco.util;

import java.util.List;

import curso.s2.banco.Cuenta;
import curso.s2.banco.Movimiento;

public class ListarMovimientos {

	
	public static void verMovimientos(List<Movimiento> mos) {
		System.out.println("-----------------Listar Movimientos---------------------- ");
		int saldo =0;
		for(Movimiento m : mos) {
			saldo += m.getmImporte(); 
			System.out.println(m.getmFecha()+"\t"+m.getmConcepto()+"\t\t"+m.getmImporte()+"\t"+saldo );
		}
	}
}
