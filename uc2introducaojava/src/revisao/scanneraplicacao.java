package revisao;

import java.util.Scanner; // importando biblioteca

public class scanneraplicacao {

	public static void main(String[] args) {
		
		String nome;
		
		Scanner input = new Scanner(System.in);
		// atribuindo o scanner a variavel input
		
		System.out.println("DIGITE SEU NOME: ");
		
		nome = input .nextLine();
		// vai armazenar no nome os dados inseridos no input
		
	
		System.out.println("O nome digitado foi: " + nome );
		
		
		input.close(); // fecha a aplicaçao dp scanner
	}
	
	
}
