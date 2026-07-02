package ativ_aula4;

import java.util.Scanner;

public class desafio_4 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

    String aluno;
    double media;

    System.out.print("Digite o nome do aluno: ");
    aluno = entrada.nextLine();

    System.out.print("Digite a média do aluno: ");
    media = entrada.nextDouble();

    if (media >= 7) {
        System.out.println("Aluno: " + aluno);
        System.out.println("Média: " + media);
        System.out.println("Resultado: APROVADO");
    } else {
        System.out.println("Aluno: " + aluno);
        System.out.println("Média: " + media);
        System.out.println("Resultado: REPROVADO");
    }

    entrada.close();
	
	
	
	
	
}
}
