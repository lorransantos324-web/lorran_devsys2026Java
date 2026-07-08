package Desafio01ListaNomes;

import java.util.ArrayList;
import java.util.Scanner;

public class ListadeNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner entrada = new Scanner(System.in);
		        ArrayList<String> nomes = new ArrayList<>();

		      
		        nomes.add("PAULA LINS");
		        nomes.add("JOSE AM");
		        nomes.add("ROBERTO K");

		        int opcao;

		        do {

		            System.out.println("===== MENU =====");
		            System.out.println("1 - Cadastrar");
		            System.out.println("2 - Listar");
		            System.out.println("0 - Sair");
		            System.out.print("Escolha uma opção: ");

		            opcao = entrada.nextInt();
		            entrada.nextLine();

		            switch (opcao) {

		                case 1:

		                    System.out.print("Digite o nome: ");
		                    String nome = entrada.nextLine();

		                    nomes.add(nome);

		                    System.out.println("Nome cadastrado com sucesso!");

		                    break;

		                case 2:

		                    System.out.println("\n===== LISTA DE NOMES =====");

		                    for (String n : nomes) {
		                        System.out.println(n);
		                    }

		                    System.out.println("Total de registros: " + nomes.size());

		                    break;

		                case 0:

		                    System.out.println("Sistema encerrado.");
		                    break;

		                default:

		                    System.out.println("Opção inválida.");

		            }

		            System.out.println();

		        } while (opcao != 0);

		        entrada.close();
		    }

		}
	//nomes.add("");

