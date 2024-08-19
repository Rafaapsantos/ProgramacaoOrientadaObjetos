package br.edu.fatecfranca;

public class Exercicio1 {
    // declaração de variaveis
    public  int numeroAluno;
    public String nome;
    public int idade;
    public float p1, p2;


    //criando o metodo construtor e declarando os parametros do metodo
    public Exercicio1(int numeroAluno, String nome, int idade, float p1, float p2){
        // atribuindo os valores passados no parametro para o objeto que chama o construtor
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    // criando um construtor vazio, ou ja atribuindo um valor a ele
    public Exercicio1(){
        this.numeroAluno = 0;
        this.nome = "não existe";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    //criando metodos
    //criando um método notaFinal() - que calcula e retorna a média final do aluno

    public float notaFinal(){
        return (this.p1+ this.p2) / 2;

    }

    //criando um método passou()

    public String passou(){
        return this.notaFinal() >= 6 ? "Aluno APROVADO" : "Aluno REPROVADO";

    }
    //criando um método dadosAluno() - que retorna os valores de numeroAluno, nome, nota final, situação e idade.
    public String dadosAlunos(){
        return  "Numero Aluno: " + numeroAluno + "\nNome: " + nome + "\nIdade: " + idade +
                "\nNota Final: " +  notaFinal() + "\nSituação: " + passou();
    }

}