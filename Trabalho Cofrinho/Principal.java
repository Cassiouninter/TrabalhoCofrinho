
//Cofrinho do Cássio Anderson de Souza Moraes Filho R.U 4658726
package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {				
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		// Menu dando as opões para o usuario
		
		System.out.println("Menu");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		opcao=teclado.nextInt();
		
		int tipoMoeda;
		double valor = 0;
		Moeda moeda =null;
		
		//condições 
		
		while(opcao!=0) {
			
			switch(opcao) {
			// Para adicionar
			case 1: 
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("Qual moeda gostaria de adicionar?");
					System.out.println("1-Dolar");
					System.out.println("2-Euro");
					System.out.println("3-Real");
					tipoMoeda = teclado.nextInt();
				}
							
				moeda =null;	
				
				if(tipoMoeda==1) {
					System.out.println("Informe o valor:");
					valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}	
				else if(tipoMoeda==2) {
					System.out.println("Informe o valor:");
					valor = teclado.nextDouble();
					moeda = new Euro(valor);
				}
				else {
					System.out.println("Informe o valor:");
					valor = teclado.nextDouble();
					moeda = new Real(valor);
			
			}
				
				cofrinho.adicionar(moeda);				
				break;
			
			case 2:
			// Para remover	
				System.out.println("Qual o valor da moeda gostaria de remover?");
                valor = teclado.nextDouble();
				
				System.out.println("Qual moeda gostaria de remover?");
                System.out.println("1-Dólar");
                System.out.println("2-Euro");
                System.out.println("3-Real");
                tipoMoeda = teclado.nextInt();

                if (tipoMoeda == 1) {
                    moeda = new Dolar(valor);
                } else if (tipoMoeda == 2) {
                    moeda = new Euro(valor);
                } else {
                    moeda = new Real(valor);
                }

                cofrinho.remover(moeda);               
                break;
				
			case 3:
				// Para Listar
				cofrinho.listar();
				break;
				
			case 4:
				// Para calcular o valor total em Reais
				System.out.println("O valor total do cofrinho convertido em Reais é de: " + cofrinho.totalConvertido());
				break;
			default:
				System.out.println("Opcao invalida!");				
			}
			
			System.out.println("Menu");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");
			opcao=teclado.nextInt();				
			
		}	
			}
		
		
		
}
