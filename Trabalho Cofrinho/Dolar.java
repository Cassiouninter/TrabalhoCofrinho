package empresa;

	public class Dolar extends Moeda{
		// imprimir alguma informação sobre a classe
		public void info () {
			System.out.println("O valor da cotacao do Dolar é de R$ 5,00");
		}
		// Contrutor
		public Dolar(double valor) {
			super(valor);
		}
		// Função para calular o valor convertido para Real
		@Override
		public
		double calculaValor() {
			
			return valor*5;
					
		}
		// função para imprimir o que é relevante ao usuário
		@Override
		public String toString() {
			return "Dolar: " + valor;
		}

			
		
		
}

	
		
		
	
	


