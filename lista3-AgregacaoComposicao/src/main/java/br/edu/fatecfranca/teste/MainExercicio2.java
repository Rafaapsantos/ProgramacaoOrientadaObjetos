package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio2.Aluno;
import br.edu.fatecfranca.exercicio2.Curso;
import br.edu.fatecfranca.exercicio2.Professor;

public class MainExercicio2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123456, "paulinho", "Paulo");
        Aluno aluno2 = new Aluno(654321, "pedrinho", "Pedro");
        Aluno aluno3 = new Aluno(564321, "rafa", "Rafaela");

        Professor professor1 = new Professor(1, "dani", "Daniel");
        Professor professor2 = new Professor(2, "carlão", "Carlos");

        Curso curso1 = new Curso(1, "Exatas", "ADS");
        curso1.addDisciplina(1, professor1, "ILP007", "poo");
        curso1.addAluno(aluno1, 1);
        curso1.addAluno(aluno2,1);
        curso1.addAluno(aluno3,1);
        System.out.println(curso1);

        Curso curso2 = new Curso(2, "Exatas", "ADS");
        curso2.addDisciplina(2, professor2, "ES001", "ES3");
        curso2.addAluno(aluno1, 2);
        curso2.addAluno(aluno2, 2);
        curso2.addAluno(aluno3, 2);
        System.out.println(curso2);
    }
}
