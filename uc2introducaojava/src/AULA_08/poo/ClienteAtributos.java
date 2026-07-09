package AULA_08.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteAtributos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== LISTA DE NOMES =====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer

            switch (opcao) {

                case 1:

                    System.out.print("Digite o nome: ");
                    String nome = entrada.nextLine();

                    nomes.add(nome);

                    System.out.println("Nome cadastrado com sucesso!");
                    break;

                case 2:

                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {

                        System.out.println("\n===== NOMES CADASTRADOS =====");

                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + " - " + nomes.get(i));
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
	
	
	
	
	
	
	
	
	

