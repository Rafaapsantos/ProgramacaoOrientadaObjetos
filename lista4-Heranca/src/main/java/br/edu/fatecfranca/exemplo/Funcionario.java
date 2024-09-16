package br.edu.fatecfranca.exemplo;
// classe abstrata
public abstract class Funcionario {
    protected String nome, endereco, cpf;
    protected float salario;

    public Funcionario() {
        this.nome="";
        this.endereco="";
        this.cpf="";
        this.salario=0;
    }

    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Number getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
//    public float calcularSalario() {
//        return salario;
//    }
    public abstract float calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + calcularSalario() +
                "} ";
    }


}
