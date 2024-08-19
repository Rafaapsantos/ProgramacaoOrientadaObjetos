package br.edu.fatecfranca;

public class Exercicio2 {
    //declarando variaveis
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    //criando o metodo construtor e declarando os parametros do metodo
    public Exercicio2(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    // criando um construtor vazio, ou ja atribuindo um valor a ele
    public Exercicio2() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "não identificado";
        this.saldo = 0;
    }

    //criando metodos
    //criando metodos realizarDeposito() e realizarSaque()

    public void realizarDeposito(float valor) {
        this.saldo += valor;
        System.out.println("\nDeposito realizado com sucesso!");
    }
    public void realizarSaque(float valor) {
        if (this.saldo - valor >= 0.0F) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saque não realizado, saldo insuficiente");
        }
    }
    //criando outro metodo dadosCliente()
    public String dadosCliente(){
        return "Numero da conta : " + numeroConta + "\nSaldo: " + saldo + "\nNome: " + nome;
    }
}
