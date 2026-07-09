package AULA_08.poo;
import java.util.ArrayList;
import java.util.Scanner;
public class PesquisarProduto {

	Scanner entrada = new Scanner(System.in);
    ArrayList<String> produtos = new ArrayList<>();

    int opcao;

    do {

        System.out.println("\n===== MENU PRODUTOS =====");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Remover produto");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();
        entrada.nextLine(); 
        switch (opcao) {

            case 1:

                System.out.print("Digite o nome do produto: ");
                String nomeProduto = entrada.nextLine();

                produtos.add(nomeProduto);

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

                if (produtos.isEmpty()) {

                    System.out.println("Nenhum produto cadastrado para remover.");

                } else {

                  
                    System.out.println("\n===== PRODUTOS CADASTRADOS =====");

                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println((i + 1) + " - " + produtos.get(i));
                    }

                   
                    System.out.print("Digite o número do produto que deseja remover: ");
                    int numeroDigitado = entrada.nextInt();

                    int indiceReal = numeroDigitado - 1;

                   
                    if (indiceReal >= 0 && indiceReal < produtos.size()) {

                        produtos.remove(indiceReal);

                        System.out.println("Produto removido com sucesso!");

                    } else {

                        System.out.println("Número inválido!");

                    }

                }

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
