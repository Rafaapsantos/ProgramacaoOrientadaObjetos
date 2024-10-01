package br.edu.fatecfranca.exercicio1;

public class Pessoa extends Animal implements IContribuinte, ICidadao, IProfessor{
    //Extends animal é herança de código- fonte
    //implements Cidadão, Contribuinte, Professor é herança de comportamento

    @Override
    public void vota() {
        System.out.println("Pessoa está votando");
    }

    @Override
    public void getRg() {
        System.out.println("RG da pessoa");
    }

    @Override
    public void pagaIR() {
        System.out.println("Pessoa paga IR");
    }

    @Override
    public void getCpf() {
        System.out.println("CPF da pessoa");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalha");
    }

    @Override
    public void ensina() {
        System.out.println("pessoa ensina");
    }
}
