package ATVi_09.poo;

public class Desafio1ClasseProdutoViws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Desafio1ClasseProduto produto1 = new Desafio1ClasseProduto("Teclado", 80.0, 1
		);



        produto1.exibirDados();

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());
        System.out.println("Quantidade: " + produto1.getQuantidade());
       System.out.println("Total: R$ " + produto1.calcularTotal());
		
		
	}

}
