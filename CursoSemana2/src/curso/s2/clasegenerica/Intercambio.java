package curso.s2.clasegenerica;

public class Intercambio<T> {
	//denifir las variables genericas
	T texto;
	T numero;
	
	
	public Intercambio(T t1,T t2){
		super();
		this.texto = t1;
		this.numero = t2;
	}
	
	public T getPrimero() {
		return texto;
	}
	public T getSegundo() {
		return numero;
	}
	public void setPrimero(T s1) {
		texto= s1;
	}
	public void setSegundo(T s1) {
		numero= s1;
	}
	/**
	 * @param un objeto Intercambio
	 * metodo para hacer el intercambio de los valores de un objeto
	 * */
	public void intercambiarValor(Intercambio ob1) {
		T temp1 = (T) ob1.getSegundo();
		ob1.setPrimero(temp1);
			
	}


}
