package empresa;

import java.util.Objects;
//Classe mãe 
public abstract class Moeda { 
		protected double valor;
		// Contrutor
		public Moeda(double valor) {
			super();
			this.valor = valor;
		}		
		
		// função para saber quais informações comparar. 
		@Override
		public int hashCode() {
			return 31 * Double.hashCode(valor) + getClass().hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Moeda moeda = (Moeda) obj;
			return Double.compare(moeda.valor, valor) == 0 && getClass().equals(moeda.getClass());
		}
			
		
		// função para imprimir o que é relevante ao usuário
		@Override
		public abstract String toString();
		
		//função para calcular o valor convertido para Real
		public abstract double calculaValor();
		
		// imprimir alguma informação sobre a classe
		public void info () {
		System.out.println("O valor convertido para Real vai depender da cotação");
						}
	
}
	
	
	
	


