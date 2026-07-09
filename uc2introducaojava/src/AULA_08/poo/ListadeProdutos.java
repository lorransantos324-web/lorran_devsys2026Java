package AULA_08.poo;
import java.util.Scanner;
import java.util.ArrayList;
public class ListadeProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MENU PRODUTOS =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Exibir quantidade de produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer

            switch (opcao) {

                case 1:

                    System.out.print("Digite o nome do produto: ");
                    String produto = entrada.nextLine();

                    produtos.add(produto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:

                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {

                        System.out.println("\n===== PRODUTOS CADASTRADOS =====");

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println((i + 1) + " - " + produtos.get(i));
                        }

                    }

                    break;

                case 3:

                    System.out.println("Quantidade de produtos cadastrados: " + produtos.size());
                    break;

                case 0:

                    System.out.println("Programa encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        entrada.close();

    }

}