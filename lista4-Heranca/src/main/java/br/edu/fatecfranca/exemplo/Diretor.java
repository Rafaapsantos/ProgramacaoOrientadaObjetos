package br.edu.fatecfranca.exemplo;

public class Diretor extends Funcionario{
    protected float acoesEmpresa;

    public Diretor() {
        super();//chama o construtor sem parametro da superclasse
        this.acoesEmpresa = 0;
    }

    public Diretor(String nome, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public float calcularSalario() {
        return this.salario + (this.acoesEmpresa * 5) / 12;
    }

    @Override
    public String toString() {
        return super.toString() + "acoesEmpresa=" + acoesEmpresa;
    }
}
