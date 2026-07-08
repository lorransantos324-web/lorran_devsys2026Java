package AULA_08.poo;

public class Pessoaviws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nome = "Paulo lins";
		pessoa1.idade = 38;
		pessoa1.nacionalidade = "Brasileira";
		
		pessoa2.nome = "Jao paulo";
		pessoa2.idade = 58;
		pessoa2.nacionalidade = "venezuelano";
		
		
		
		pessoa1.exibirPessoa();
		pessoa1.exibirDadosextras();
		pessoa2.exibirPessoa();
	}

}
