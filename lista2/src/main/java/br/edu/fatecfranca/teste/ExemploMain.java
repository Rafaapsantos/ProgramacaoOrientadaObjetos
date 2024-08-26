package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.exe.Exemplo;

public class ExemploMain {
    public static void main(String[] args) {
        try {
            Exemplo aluno1 = new Exemplo("rafaela", 123, 7.5f);

            Exemplo aluno2 = new Exemplo();
            aluno2.setNome("Higor");
            aluno2.setRa(12345678);
            aluno2.setMedia(8.5f);

            System.out.println("ra = " + aluno2.getRa());

            Exemplo aluno3 = new Exemplo();
            aluno3.setNome("Ana");
            aluno3.setRa(87654);
            aluno3.setMedia(10.5f);
            System.out.println(aluno3);

            Exemplo aluno4 = new Exemplo("Joao", 123, 7.3f);
            System.out.println(aluno4);

        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}
