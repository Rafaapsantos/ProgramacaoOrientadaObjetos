package br.edu.fatecfranca.exercicio5;

public class Conta {
    private String nome;
    private float salario, saldo, limite;
    private int numeroConta;

    public Conta() {
    }

    public Conta(String nome, int numeroConta, float salario, float saldo, float limite) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.salario = salario;
        this.saldo = saldo;
        setLimite(limite);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite> this.salario){
            System.out.println("O limite não pode ser maior que o salário mensal");
        }else {
            this.limite = limite;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void deposito(float valor){
        this.saldo += valor;
    }
    public boolean retira(float valor){
        if (valor > this.saldo){
           return false;
        }else {
            this.saldo -= valor;
            return true;
        }
    }
    public void mostraSaldo (Object cliente){
        System.out.println("O saldo do cliente "+ this.nome + " é de " + this.saldo);
    }


}
