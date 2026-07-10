package AULA_09;

public class MetodoConstrutor2 {

	private String nome;
    private double preco;
    private int estoque;
    
    public MetodoConstrutor2() {
    }
    
    
    public MetodoConstrutor2(String nome, double preco, int estoque) {
    	 setNome(nome);
         setPreco(preco);
         setEstoque(estoque);
    }
    
    public String getNome() {
    	return nome;
    }
	
    public void setNome(String nome) {
    if (nome != null && !nome.isBlank()) {	
    	this.nome = nome;
    } else {
    	System.out.println("Nome do produto não pode estar vazio.");
    }
  }  
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }
    
    public double calcularValorTotalEstoque() {
        return preco * estoque; 

 
        public void exibirDados() {
            System.out.println("Produto: " + nome);
            System.out.printf("Preço: R$ %.2f%n", preco);
            System.out.println("Estoque: " + estoque);
            System.out.printf("Total em estoque: R$ %.2f%n", calcularValorTotalEstoque());       
        
        
        
}
}