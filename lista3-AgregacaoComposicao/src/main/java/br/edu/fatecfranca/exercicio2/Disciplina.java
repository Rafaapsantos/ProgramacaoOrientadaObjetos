package br.edu.fatecfranca.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome, sigla;
    private List<Aluno> alunos;
    private Professor professor;

    public Disciplina() {
        this.alunos = new ArrayList<Aluno>();
    }

    public Disciplina(int id, Professor professor, String sigla, String nome) {
        this.id = id;
        this.professor = professor;
        this.sigla = sigla;
        this.nome = nome;
        this.alunos =new ArrayList<Aluno>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //adiciona um aluno na lista alunos
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }
}
