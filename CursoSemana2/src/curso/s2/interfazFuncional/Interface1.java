package curso.s2.interfazFuncional;


@FunctionalInterface
public interface Interface1 {

	public int cuenta(int a, int b);

	public default int resuelto(int i) {
		return i*2;
	}
	
	public default String  saluda() {
		return"Hola";
	}
	
}
