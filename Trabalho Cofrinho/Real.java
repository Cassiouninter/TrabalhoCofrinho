package empresa;

	public class Real extends Moeda{
		
		// imprimir alguma informação sobre a classe
		public void info () {
		System.out.println("O valor do real é a base de calculo do cofrinho");
				}
		// Contrutor
		public Real(double valor) {
			super(valor);
		}
		// Função padrão para retornar apenas o valor do Real
		public double calculaValor() {
			
			return valor;
	
			
	}
		// função para imprimir o que é relevante ao usuário
		@Override
		public String toString() {
			return "Real: " + valor;
		}

			
				
}


