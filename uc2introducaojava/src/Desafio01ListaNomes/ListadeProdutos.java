package Desafio01ListaNomes;
import java.util.ArrayList;
import java.util.Scanner;

public class ListadeProdutos {

	public static void main(String[] args) {
     
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<>();
		 int opcao;

	        do {
	        	System.out.println("===== MENU PRODUTOS =====");
	            System.out.println("1 - Cadastrar produto");
	            System.out.println("2 - Listar produtos");
	            System.out.println("3 - Remover produto");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");

	            opcao = entrada.nextInt();
	            entrada.nextLine(); // Limpa o Enter

	            switch (opcao) {

	                case 1:
	                    System.out.print("Digite o Pr ");
	                    String produto = entrada.nextLine();

	                    produtos.add(produto);

	                    System.out.println("Produto cadastrado com sucesso!");
	                    break;

	                case 2:

	                  
	                case 3:

	                   
	                case 0:

	                    System.out.println("Sistema encerrado.");
	                    break;

	                default:

	                    System.out.println("Opção inválida!");

	            }

	            System.out.println();

	        } while (opcao != 0);

	        entrada.close();
		
		
		
	}

}
