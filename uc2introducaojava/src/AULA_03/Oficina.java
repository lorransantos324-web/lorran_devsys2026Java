package AULA_03;

import java.text.DecimalFormat;


public class Oficina {

	public static void main(String[] args) {
		
		double v1,v2,
		soma, subtraçao, multiplicaçao, divisao, resto; 
		
		v1 = 100; v2 = 20;
		soma = v1 + v2;
		System.out.println("Soma: de " + v1 + "+" +v2+ "=" + soma );
			System.out.printf("\nTotal Soma: R$ %.5f%n" , soma);
		DecimalFormat formato = new DecimalFormat("#,##0.00");
		
		
		subtraçao = v1 - v2;
		
		multiplicaçao = v1 * v2;
		
		
		divisao = v1 / v2;
		
		
		resto = v1 % v2;
		
		
		System.out.println("subtraçao: de " + v1 + "-" +v2+ "=" + subtraçao );
		System.out.println("multiplicaçao: de " + v1 + "*" +v2+ "=" + multiplicaçao );
		System.out.println("divisao: de " + v1 + "/" +v2+ "=" + divisao );
		System.out.println("resto: de " + v1 + "%" +v2+ "=" + resto );
		System.out.println("MUDANÇA DE SAIDA");
		
	
		System.out.printf("\nTotal subtraçao: R$ %.5f%n" , subtraçao);
		System.out.printf("\nTotal multiplicaçao: R$ %.5f%n" , multiplicaçao);
		System.out.printf("\nTotal divisao: R$ %.5f%n" , divisao);
		System.out.printf("\nTotal resto: R$ %.5f%n" , resto); 
		System.out.printf("mudança de valores ================");
		
		
		System.out.println("Soma R$ " + formata.format(soma));
		
		
		
		
		
		
		

	}

}
