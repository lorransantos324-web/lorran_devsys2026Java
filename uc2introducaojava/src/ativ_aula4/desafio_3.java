package ativ_aula4;


import java.util.Scanner;

public class desafio_3 {
 public static void main(String[] args) {
	
	 Scanner entrada = new Scanner(System.in);
	 
	 int numero;
	 
	 System.out.println("DIGITE UM NUMERO");
	 numero = entrada.nextInt();
	 

     if (numero % 2 == 0) {
         System.out.println("O número é par.");
     } else {
         System.out.println("O número é ímpar.");
     }

     entrada.close();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
