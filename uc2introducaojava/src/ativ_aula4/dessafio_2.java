package ativ_aula4;

import java.util.Scanner;

public class dessafio_2 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	int numero;
	 System.out.println("Digite um numero");
	 numero = entrada.nextInt();
		
	 if(numero > 0) {
		 System.out.println("Numero é positivo");
	 } else if (numero < 0) {
	
		 System.out.println("Numero é negativo");
		 	 
	 } else {
		 System.out.println("O numero é zero");
	 }
		
		
		
		
	 entrada.close();	
		
		
		
		
	}
}
