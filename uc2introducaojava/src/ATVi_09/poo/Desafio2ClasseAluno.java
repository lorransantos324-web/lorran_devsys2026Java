package ATVi_09.poo;

public class Desafio2ClasseAluno {

  private String nome;
  private String curso;
  private double nota1;
  private double nota2;
  
	public Desafio2ClasseAluno () {	
	}
  
	public Desafio2ClasseAluno(String nome, String curso,
	        double nota1, double nota2) {

	    setNome(nome);
	    setCurso(curso);
	    setNota1(nota1);
	    setNota2(nota2);	  
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
  
  
  public String getCurso() {
      return curso;
  }

  public void setCurso(String curso) {
      if (curso != null && !curso.trim().isEmpty()) {
          this.curso = curso;
      } else {
          System.out.println("O curso não pode ser vazio.");
      }
  }

  
  public double getNota1() {
      return nota1;
  }

  public void setNota1(double nota1) {
      if (nota1 >= 0 && nota1 <= 10) {
          this.nota1 = nota1;
      } else {
          System.out.println("A nota 1 deve estar entre 0 e 10.");
      }
  }	
	
  public double getNota2() {
      return nota2;
  }

  public void setNota2(double nota2) {
      if (nota2 >= 0 && nota2 <= 10) {
          this.nota2 = nota2;
      } else {
          System.out.println("A nota 2 deve estar entre 0 e 10.");
      }
  }
  
  
  public double calcularMedia() {
      return (nota1 + nota2) / 2;
  }


  public String verificarSituacao() {

      double media = calcularMedia();

      if (media >= 7) {
          return "Aprovado";
      } else if (media >= 5) {
          return "Recuperação";
      } else {
          return "Reprovado";
      }
  }
  
  public void exibirDados() {
      System.out.println("Nome: " + nome);
      System.out.println("Curso: " + curso);
      System.out.println("Nota 1: " + nota1);
      System.out.println("Nota 2: " + nota2);
      System.out.printf("Média: %.1f%n", calcularMedia());
      System.out.println("Situação: " + verificarSituacao());
  }

  
  
}
