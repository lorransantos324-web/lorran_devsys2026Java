package AULA_06;

import java.util.Scanner;

public class WhileScannerAtiv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicao = 1, contador = 1, limite = 5;
		String conteudo;
		Scanner input = new Scanner(System.in);
		
		while(condicao==1) {
		System.out.println("Tentativas :" + contador+  "de" +limite);
			System.out.println("DIGITE ALGUMA COISA");
            conteudo =input.nextLine(); 		
		
		if(contador==limite) {
	  condicao = 0 ;		
	}
		contador++;
		}//if(conteudo.equals)
		System.out.println(" SISTEMA DE TENTATIVAS FOI ENCERRADO");
		
		
		
		
		
		
	}

}
