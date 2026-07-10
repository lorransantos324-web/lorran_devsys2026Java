package AULA_09;

public class EncapsulamentoModelo {

	private String nome;
	private double preco  , valortotal;
	private int estoque =200 , estoqueanterior , entrada , saida =0;
	

	
	
	public String getNome() {
        return nome;
    }
	
	public void setNome(String nome) {
		this.nome = nome; 
				}
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		
        if (preco >= 0) {
                System.out.println("Preço não pode ser negativo.");
        } else {
   this.preco = preco;     }
    }
	
	 public int getEstoque() {
	        return estoque;
	    }
	 
	 public void setEstoque(int estoque) {
	        if (estoque < 0) {
	   System.out.println("Estoque não pode ser negativo.");     	
	            this.estoque = estoque;
	        } else {
	            entrada = estoque;
	            estoqueanterior = this.estoque;
	            this.estoque = estoqueanterior + estoque;
	            valortotal = estoque * preco;
	        	
	        }

	 }
	
	 
	 public void setSaida(int saida) {
		 if(saida!=0 && saida>estoque) {
			 System.out.println("Saida inconsitente");
		 } else {
			 estoqueanterior = estoque;
			 this.saida = saida;
			 estoque -= saida;
			 
		 }
			 }
	 
	 
	
	 public void exibirDados() {
	        System.out.println("Produto: " + nome);
	        System.out.printf("Valor : %.2f%n" , preco);
	        System.out.println("Estoque Anterior : " + estoqueanterior);
	        System.out.println("Entrada de: " + entrada);
	        System.out.println("Estoque ataul: " + estoque);
	 
	 
	 }
	
	
	
}
