package desafiosaula2;

import java.util.Scanner;

public class CadastrodeProduto {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
	
		String nomeProduto;
        String categoria;
        double preco;
        int quantidade;
        int codigo;
		
		
		System.out.print("Digite o nome do produto: ");
        nomeProduto = entrada.nextLine();
		
        System.out.print("Digite a categoria do produto: ");
        categoria = entrada.nextLine();
		
        System.out.print("Digite o preco do produto: ");
        preco = entrada.nextInt();
                entrada.nextLine();
                
        System.out.println("Digite a quantidade do produto");
        quantidade = entrada.nextInt();
                     entrada.nextLine();
                     
        System.out.println("Digite o codigo do produto");             
        codigo = entrada.nextInt();
                  entrada.nextLine();
                  
                  
          System.out.println("===== PRODUTO CADASTRADO =====");
          System.out.println("Produto: " + nomeProduto);
          System.out.println("Categoria: " + categoria);                           
          System.out.println("Preco:" + preco );                
		  System.out.println("quantidade" + quantidade);
		  System.out.println("codigo:" + codigo );
		
		
		
		 entrada.close();	

	}

}
