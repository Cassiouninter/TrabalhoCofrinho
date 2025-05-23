package empresa;

public class Euro extends Moeda {
	//Imprimir alguma informação sobre a classe
	public void info () {
		System.out.println("O valor da cotacao do Euro é de R$ 6,00");
		
	}
	// Contrutor
	public Euro(double valor) {
		super(valor);
	}
	// Função para calular o valor convertido para Real
	public double calculaValor() {
		
		return valor*6;
			
	}
	// função para imprimir o que é relevante ao usuário
	@Override
	public String toString() {
		return "Euro: " + valor;
	}
	
	
}

		

