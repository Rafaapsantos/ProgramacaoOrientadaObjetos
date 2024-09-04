package br.edu.fatecfranca.exercicio1;

public class Person {
    private int id;
    private String nome;
    private String user;

    public Person() {
        this.nome ="";
        this.user ="";
    }

    public Person(int id, String nome, String user) {
        this.id = id;
        this.nome = nome;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
