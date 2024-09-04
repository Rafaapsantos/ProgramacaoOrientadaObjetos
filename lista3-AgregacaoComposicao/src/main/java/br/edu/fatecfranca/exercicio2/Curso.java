package br.edu.fatecfranca.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name, area;
    private List<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public Curso(int id, String area, String name) {
        this.id = id;
        this.area = area;
        this.name = name;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public void addDisciplina(int id, Professor professor, String sigla, String nome) {
        this.disciplinas.add(new Disciplina(id, professor, sigla, nome));
    }

    public void addAluno(Aluno aluno, int idDisciplina){
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getId() == idDisciplina) {
                disciplina.addAluno(aluno);
                return;
            }
        }
        System.out.println("Disciplina não existe");
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", disciplina=" + disciplinas +
                '}';
    }
}
