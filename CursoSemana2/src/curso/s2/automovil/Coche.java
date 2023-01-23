package curso.s2.automovil;


//la clase coche hereda de la clase auto y implementa el interface 4x4
public class Coche extends Auto implements Para4x4{

    //definir las variables propias
	private String color;
	private int numPuertas;
	private String modelo;
	private boolean situacion4x4;
	
	public Coche(int numMarchas, int velocidadMaxima, int numChasis, int numRuedas,
					String c,int nPuertas,String m) {
		super(numMarchas, velocidadMaxima, numChasis, numRuedas);
		// TODO Auto-generated constructor stub
		setColor(c);
		setNumPuertas(nPuertas);
		setModelo(m);
	}
	

	public boolean isSituacion4x4() {
		return situacion4x4;
	}


	public void setSituacion4x4(boolean situacion4x4) {
		this.situacion4x4 = situacion4x4;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void activarReductora(boolean activar) {
		this.setSituacion4x4(activar);
		
	}
	@Override
	public String toString() {
		return "El coche: "+super.toString()+" [color=" + color + ", numPuertas=" + numPuertas + "]";
	}

	//implementar el metodo del interface
	
	
	
	
	
	
	

}
