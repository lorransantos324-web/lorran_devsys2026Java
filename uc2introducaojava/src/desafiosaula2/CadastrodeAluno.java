package desafiosaula2;

import java.util.Scanner;

public class CadastrodeAluno {

	public static void main(String[] args) {
		
		String nome,curso, cidade ;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NOME:");
		 nome = input.nextLine();
		 
		 System.out.println("DIGITE SEU CURSO:");
		  curso = input.nextLine();
		  
		 System.out.println("DIGITE SUA CIDADE:");  
		  cidade = input.nextLine();
		  
		  System.out.println("DIGITE SUA IDADE:");
		  idade = input.nextInt();
		    input.nextLine();
		    
		    System.out.println("CADASTRO DE USUÁRIO:");
			   System.out.println("NOME:" + nome);
			   System.out.println("CIDADE:" + cidade);
			   System.out.println("IDADE:" + idade);
			   System.out.println("CURSO:" + curso);
		
		
		
		
		
		
		    input.close();		
		
	}

}
