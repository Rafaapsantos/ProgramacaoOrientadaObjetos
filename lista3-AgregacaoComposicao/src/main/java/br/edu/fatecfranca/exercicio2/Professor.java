package br.edu.fatecfranca.exercicio2;

public class Professor {
    private int id;
    private String nome, userName;

    public Professor() {
    }

    public Professor(int id, String userName, String nome) {
        this.id = id;
        this.userName = userName;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
