package ATVi_09.poo;

public class Desafio3ClasseContaBancariaViws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desafio3ClasseContaBancaria conta =
                new Desafio3ClasseContaBancaria("Maria", "12345", 500);

        conta.exibirDados();

        System.out.println();

        conta.depositar(200);
        conta.exibirDados();

        System.out.println();

        conta.sacar(100);
        conta.exibirDados();
	}

}
