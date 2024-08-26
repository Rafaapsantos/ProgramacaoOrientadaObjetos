package br.edu.fatecfranca.exe;

public class Exercicio2 {
    private int numeroAluno, idade;
    private String nome;
    private float p1,p2;

    //construtores
    public Exercicio2(int numeroAluno, float p2, float p1, String nome, int idade) {
        this.setNumeroAluno(numeroAluno);
        this.setP2(p2);
        this.setP1(p1);
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Exercicio2() {
    }

    //getters e setters
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        String numeroAlunoStr = Integer.toString(numeroAluno);
        if (numeroAlunoStr.length()==6){
            this.numeroAluno = Integer.parseInt(numeroAlunoStr);
        }else{
            throw new IllegalArgumentException("O tamanho está errado, precisa ter tamanho 6");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 > 0){
            this.p2 = p2;
        }else {
            throw new IllegalArgumentException("A nota não pode ser negativa");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 > 0){
            this.p1 = p1;
        }else {
            throw new IllegalArgumentException("A nota não pode ser negativa");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Problema com tamanho do nome, não pode passar de 30");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }else {
            throw new IllegalArgumentException("A idade não pode ser negativa");
        }
    }

    //metodos
    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    @Override
    public String toString() {
        return "Exercicio2{" +
                "numeroAluno=" + numeroAluno +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", Nota Final=" + notaFinal() +
                '}';
    }
}
