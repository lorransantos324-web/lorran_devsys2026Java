package AULA_07;
import java.util.Scanner;
public class SwitchAtiv2 {
public static void main(String[] args) {
	
	
	int opcao = -1;
	int codicao = 1;
	
	Scanner input = new Scanner(System.in);
	System.out.println("DIGITE UM NUMERO");
	opcao = input.nextInt();
	
	if(input.hasNextInt()) {
	 
		
		while(opcao) {
		
	}
	
		opcao = input.nextInt();
	switch (opcao) {
	case 1: {
		
		System.out.println("Opçao 1 cadastra produtos");
        break;
	}
	
case 2: {
		
	
       System.out.println("Opçao 2 listar");
       break;
}
	
	
	
	default:
		System.out.println("opçao nao disponivel");
	}
		
		//System.out.println( input+ "Numero valido");
	}else {
		System.out.println( input+ "Nao e um numero valido");
	}
	 
	
		 
}
}
