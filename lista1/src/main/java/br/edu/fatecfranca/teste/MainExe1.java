package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.Exercicio1;

public class MainExe1 {
    public static void main(String[] args) {
        Exercicio1 testaAluno = new Exercicio1(1,"rafaela",19, 4, 6);
        System.out.println(testaAluno.dadosAlunos());

        Exercicio1 testaAluno2 = new Exercicio1();
        System.out.println("\n"+ testaAluno2.dadosAlunos());
    }
}