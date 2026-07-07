package AULA_07;

import java.util.ArrayList;

public class ArrayListatv1 {

	public static void main(String[] args) {
		
		//Arraylist<String> nomes = new ArrayList<> 
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		
		nomes.add("PAULA LINS");
		nomes.add("JOSE AM");
		nomes.add("ROBERTO K");
		
		System.out.println("TOTAL DE RESGISTRO:" +nomes.size());
		
		for(String lua : nomes) {
			System.out.println(lua); 
		}
		
		
		//for(int i=0; i<nomes.size();i++) {
			////System.out.println(nomes);
	//	}  
	}

}
