package ativ_aula4;

import java.util.Scanner;

public class desafio_5 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	 
       double media;

       System.out.print("Digite a média do aluno: ");
       media = entrada.nextDouble();

       if (media >= 9) {
           System.out.println("Classificação: EXCELENTE");
       } else if (media >= 7) {
           System.out.println("Classificação: APROVADO");
       } else if (media >= 5) {
           System.out.println("Classificação: RECUPERAÇÃO");
       } else {
           System.out.println("Classificação: REPROVADO");
       }

       entrada.close();
	
	
	
	
	
	
	
}
	
}
