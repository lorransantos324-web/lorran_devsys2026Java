package ativ_aula4;

import java.util.Scanner;

public class desafio_1 {
public static void main(String[] args) {
	
	  Scanner entrada = new Scanner(System.in);
	
	int idade;
	
	System.out.print("Digite sua idade:");
	 idade= entrada.nextInt();
	
	if (idade >= 18) {
		System.out.println("Maior de idade.");
	} else if (idade <= 18) {
		System.out.println("Menor de idade.");
	} else {
		System.out.println("Idade maior ou menor de 18 .");
	} 
	
	
	
	 entrada.close();
	
	
}

	
}
