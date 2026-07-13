package ATVi_09.poo;

public class Desafio1ClasseProduto {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Desafio1ClasseProduto() {

    }

    
    public Desafio1ClasseProduto(String nome, double preco, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

       public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode ser vazio.");
        }
    }

      public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

     public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("A quantidade não pode ser negativa.");
        }
    }

     public double calcularTotal() {
        return preco * quantidade;
    }

       public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}