package view;
import java.util.List;

import controller.Cardapio;
import model.Prato;
public class Main {

	public static void main(String[] args) {

		        Cardapio cardapio = new Cardapio();

		    
		        cardapio.adicionarPrato(new Prato("Camarão à Baiana", 25.99));
		        cardapio.adicionarPrato(new Prato("Lagosta Grelhada", 45.99));
		        cardapio.adicionarPrato(new Prato("Salmão ao Molho de Maracujá", 30.99));
		        cardapio.adicionarPrato(new Prato("bacalhau á Brás", 50.99));
		        cardapio.adicionarPrato(new Prato("Lula grelhada", 30.99));
		        cardapio.adicionarPrato(new Prato("Risoto de frutos do mar", 50.99));
		        cardapio.adicionarPrato(new Prato("Ensopado de marisco", 30.55));
		        cardapio.adicionarPrato(new Prato("Paella Marinera", 50.99));
		        cardapio.adicionarPrato(new Prato("Casquinha de Siri", 20.99));
		        cardapio.adicionarPrato(new Prato("Peixe Assado na Brasa", 25.55)); 
		        
		        
		        exibirCardapio(cardapio.getPratos());
		    }

		    public static void exibirCardapio(List<Prato> pratos) {
		        System.out.println("------- Cardápio de Frutos do Mar -------");
		        for (Prato prato : pratos) {
		            System.out.println(prato.getNome() + " - R$" + prato.getPreco());
		        }
		    }
		}
	


