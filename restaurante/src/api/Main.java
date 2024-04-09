package api;
import java.util.List;
import java.util.Scanner;

import controller.Cardapio;
import model.ItemMenu;
import view.Mensagens;
public class Main {

	public static void main(String[] args) {

		        Cardapio cardapio = new Cardapio();
		        
		        
		    
		        cardapio.adicionarPrato(new ItemMenu(0,"Camarão à Baiana", 25.99));
		        cardapio.adicionarPrato(new ItemMenu(1,"Lagosta Grelhada", 45.99));
		        cardapio.adicionarPrato(new ItemMenu(2,"Salmão ao Molho de Maracujá", 30.99));
		        cardapio.adicionarPrato(new ItemMenu(3,"bacalhau á Brás", 50.99));
		        cardapio.adicionarPrato(new ItemMenu(4,"Lula grelhada", 30.99));
		        cardapio.adicionarPrato(new ItemMenu(5,"Risoto de frutos do mar", 50.99));
		        cardapio.adicionarPrato(new ItemMenu(6,"Ensopado de marisco", 30.55));
		        cardapio.adicionarPrato(new ItemMenu(7,"Paella Marinera", 50.99));
		        cardapio.adicionarPrato(new ItemMenu(8,"Casquinha de Siri", 20.99));
		        cardapio.adicionarPrato(new ItemMenu(9,"Peixe Assado na Brasa", 25.55)); 
		        
		        cardapio.adicionarBebida(new ItemMenu(0,"Vinho tinto", 45.99));
		        cardapio.adicionarBebida(new ItemMenu(1,"Cerveja artesnal", 55.99));
		        cardapio.adicionarBebida(new ItemMenu(2,"Margarita", 30.99));
		        cardapio.adicionarBebida(new ItemMenu(3,"Gim Tônica", 50.99));
		        cardapio.adicionarBebida(new ItemMenu(4,"Mojito", 20.99));
		        cardapio.adicionarBebida(new ItemMenu(5,"Whisky Sour", 50.99));
		        cardapio.adicionarBebida(new ItemMenu(6,"Tequila Sunrise", 30.55));
		        cardapio.adicionarBebida(new ItemMenu(7,"martini Seco", 40.99));
		        cardapio.adicionarBebida(new ItemMenu(8,"Suco de uva", 10.99));
		        cardapio.adicionarBebida(new ItemMenu(9,"água", 10.55)); 
		        
		        
		        Scanner scanner = new Scanner(System.in);

		    
		        System.out.println("Escolha entre Prato (0) e Bebida (1):");
		        int escolhaCategoria = scanner.nextInt();

		      
		        if (escolhaCategoria == 0) {
		            System.out.println("\n------- Cardápio de Frutos do Mar -------");
		            exibirItens(cardapio.getPratos());
		        } else if (escolhaCategoria == 1) {
		            System.out.println("\n------- Cardápio de Bebidas -------");
		            exibirItens(cardapio.getBebidas());
		        } else {
		            System.out.println("Escolha inválida!");
		            return;
		        }

		  
		        System.out.println("Escolha o código do item desejado:");
		        int codigoEscolhido = scanner.nextInt();

		   
		        if (escolhaCategoria == 0) {
		            System.out.println("Você escolheu: " + nomeDoItem(cardapio.getPratos(), codigoEscolhido));
		        } else if (escolhaCategoria == 1) {
		            System.out.println("Você escolheu: " + nomeDoItem(cardapio.getBebidas(), codigoEscolhido));
		        }
		    }

		    public static void exibirItens(List<ItemMenu> itens) {
		        for (ItemMenu item : itens) {
		            System.out.println(item.getCodigo() + " - " + item.getNome() + " - R$" + item.getPreco());
		        }
		    }

		    public static String nomeDoItem(List<ItemMenu> itens, int codigo) {
		        for (ItemMenu item : itens) {
		            if (item.getCodigo() == codigo) {
		                return item.getNome();
		            }
		        }
		        return "Item não encontrado!";
		    }
		    
		        
		        
		        
		     
		    public static void exibirCardapio(List<ItemMenu> itens) {
		    	Mensagens mensagem = new Mensagens();
		    	StringBuilder pedidos = new StringBuilder("Usuários Cadastrados:\n");
		        for (ItemMenu item : itens) {
		        	pedidos.append("Produto: ").append(item.getNome()).append("\n");
		        }
		        mensagem.mostrarInformacao(pedidos.toString());
		    }
		}
	


