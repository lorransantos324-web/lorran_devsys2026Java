package DIA_04;

import java.util.Scanner;

public class condicionalifOficine {
 public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);
	 double  media, bim1, bim2,bim3,bim4;
	
	
	 System.out.println("DIGITE A NOTA DO 1° BIMESTRE:");
	 bim1 = input.nextDouble();
	 System.out.println("DIGITE A NOTA DO 2° BIMESTRE:");
	  bim2 = input.nextDouble();
	 System.out.println("DIGITE A NOTA DO 3° BIMESTRE:");
	 bim3 = input.nextDouble();
	 System.out.println("DIGITE A NOTA DO 4° BIMESTRE:");
	  bim4 = input.nextDouble();
	 
	
	 media = (bim1+bim2+bim3+bim4)/4;
	 
	 if (media>=7 ) {
		 System.out.printf("APROVADO com media %.2fn" , media);
	 } else if(media>=4) {
	   System.out.printf("RECUPERAÇÃO com media %.2fn" , media);
		 }else {
			 System.out.printf("REPROVADO com media %.2fn" , media);
	 
	 
	 
	}
	 


	
}	
}


  
	// if (media < 0 || media > 10) {
	//	alert("MEDIA VALIDA");
	//}else if (media >= 7); {
	// } alert ("APROVADO")
	 