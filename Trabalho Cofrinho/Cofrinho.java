package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	
    private ArrayList<Moeda> listaMoedas; 

    // Construtor para a lista
    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    // Método de adicionar 
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        
    }

    // Métodode de remover
    public void remover(Moeda moeda) {
        if (listaMoedas.remove(moeda)) {
            System.out.println("A moeda foi removida!");
        } else {
            System.out.println("Nao encontrei a moeda");
        }
    }

    // Método para listar
    public void listar() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas que estão no cofrinho:");
            for (Moeda moeda : listaMoedas) {
                System.out.println(moeda);
            }
        }
    }

    // Método para calcular o total convertido para Real
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.calculaValor();
        }
        return total;
    }
}
