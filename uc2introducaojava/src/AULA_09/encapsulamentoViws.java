package AULA_09;

public class encapsulamentoViws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EncapsulamentoModelo produto1 = new EncapsulamentoModelo();


 produto1.setNome("Computador");		
 produto1.setPreco(89.90);		
 produto1.setEstoque(2);		
		
		
	produto1.exibirDados();	
		
		
		
	System.out.println("Nome consultado pelo getter: " 
	+ produto1.getNome());
		
		
		
	}

}
