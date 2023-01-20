package curso.s2.herencia.agroalimentaria;

public class CongeladoPorAire extends ProductoCongelado{
		

		private double porcNitro;
		private double porcOxig;
		private double porcDiox;
		private double porcVapor;
		/**
		 * 
		 * @param fechaC fecha de caducidad
		 * @param nLote numero de lote
		 * @param tp temperatura
		 * @param nitro porcentaje de nitrogeno
		 * @param oxi porcentaje de oxigeno
		 * @param diox porcentaje de dioxido
		 * @param vap porentaje de vapor de agua
		 * 
		 * 
		 * */
	
		public CongeladoPorAire(String fechaC,int nLote,double tp,
				double nitro,double oxi,double diox,double vap) {
			super(fechaC, nLote, tp);
			this.setPorcDiox(diox);
			this.setPorcNitro(nitro);
			this.setPorcVapor(vap);
			this.setPorcOxig(oxi);
			
		}


		public double getPorcNitro() {
			return porcNitro;
		}

		public void setPorcNitro(double porcNitro) {
			this.porcNitro = porcNitro;
		}

		public double getPorcOxig() {
			return porcOxig;
		}

		public void setPorcOxig(double porcOxig) {
			this.porcOxig = porcOxig;
		}

		public double getPorcDiox() {
			return porcDiox;
		}

		public void setPorcDiox(double porcDiox) {
			this.porcDiox = porcDiox;
		}

		public double getPorcVapor() {
			return porcVapor;
		}

		public void setPorcVapor(double porcVapor) {
			this.porcVapor = porcVapor;
		}

		
		@Override
		public String toString() {
			return "Producto congelado por aire: "+super.toString()+" , porcNitro=" + porcNitro + ", porcOxig=" + porcOxig + ", porcDiox=" + porcDiox
					+ ", porcVapor=" + porcVapor;
		}
		
		
	
}
