package AULA_07;

public class ArrayRevisao {

	public static void main(String[] args) {
		
	String [] nomes= {
			"CARLOS",
			"ANDRE",
			"LUIS",
	         "MARIA",
             "JOSE"
	         };
	
	String listarnomes="";
	for(int i=0;i<nomes.length;i++) {
		listarnomes += nomes[i]+"\n";
		
	}
		System.out.println(listarnomes);
	}

}
