package br.edu.fatecfranca.exercicio2;

public class Aluno {
    private int ra;
    private String nome, userName;

    public Aluno() {
    }

    public Aluno(int ra, String userName, String nome) {
        this.ra = ra;
        this.userName = userName;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
