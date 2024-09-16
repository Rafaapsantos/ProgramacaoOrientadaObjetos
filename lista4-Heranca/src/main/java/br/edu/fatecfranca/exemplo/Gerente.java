package br.edu.fatecfranca.exemplo;

public class Gerente extends Funcionario{
    protected float bonus;

    public Gerente() {
        super();//chama o construtor sem parametro da superclasse
        this.bonus = 0;
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calcularSalario() {
        return this.salario + this.bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "bonus=" + bonus;
    }
}

