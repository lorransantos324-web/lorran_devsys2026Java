package ATVi_09.poo;

public class Desafio3ClasseContaBancaria {

private String titular;	
private	String numeroConta;
private	double saldo;

public Desafio3ClasseContaBancaria() {

}

public Desafio3ClasseContaBancaria(String titular, String numeroConta, double saldo) {
    setTitular(titular);
    setNumeroConta(numeroConta);
    setSaldo(saldo);
}

public String getTitular() {
    return titular;
}

public void setTitular(String titular) {
    if (titular != null && !titular.trim().isEmpty()) {
        this.titular = titular;
    } else {
        System.out.println("O titular não pode ser vazio.");
    }
}
	
public String getNumeroConta() {
    return numeroConta;
}

public void setNumeroConta(String numeroConta) {
    if (numeroConta != null && !numeroConta.trim().isEmpty()) {
        this.numeroConta = numeroConta;
    } else {
        System.out.println("O número da conta não pode ser vazio.");
    }
}

// Getter e Setter do saldo
public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    if (saldo >= 0) {
        this.saldo = saldo;
    } else {
        System.out.println("O saldo não pode ser negativo.");
    }
}

// Depositar
public void depositar(double valor) {

    if (valor > 0) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    } else {
        System.out.println("Valor inválido para depósito.");
    }

}

// Sacar
public void sacar(double valor) {

    if (valor <= 0) {
        System.out.println("Valor inválido para saque.");
    } else if (valor > saldo) {
        System.out.println("Saldo insuficiente.");
    } else {
        saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
    }

}


public void exibirDados() {
    System.out.println("Titular: " + titular);
    System.out.println("Conta: " + numeroConta);
    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
}

}
