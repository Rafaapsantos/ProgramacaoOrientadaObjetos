package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe.Exercicio2;

public class Exercicio2Main {
    public static void main(String[] args) {
        //opção 1
        Exercicio2 aluno1 = new Exercicio2();

        IllegalArgumentException e;
        try {
            aluno1.setNumeroAluno(123456565);
        } catch (IllegalArgumentException var1) {
            e = var1;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setP1(-7.2f);
        } catch (IllegalArgumentException var2) {
            e = var2;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setP2(-6.5f);
        } catch (IllegalArgumentException var3) {
            e = var3;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setNome("Rafaela aparecida dos santos Rafaela aparecida dos santos  ");
        } catch (IllegalArgumentException var4) {
            e = var4;
            System.out.println(e.getMessage());
        }

        try {
            aluno1.setIdade(-5);
        } catch (IllegalArgumentException var5) {
            e = var5;
            System.out.println(e.getMessage());
        }

        aluno1.notaFinal();
        System.out.println(aluno1);

        //opção 2
        Exercicio2 aluno2 = new Exercicio2(123456,8.2f,5.3f,
                "Rafaela",19);

        aluno2.notaFinal();
        System.out.println(aluno2);
    }
}
