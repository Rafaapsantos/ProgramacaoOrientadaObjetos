package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio1.Forum;
import br.edu.fatecfranca.exercicio1.Message;
import br.edu.fatecfranca.exercicio1.Person;

public class MainExercicio1 {
        public static void main(String[] args) {
            Person pessoa1   = new Person(1, "Rafaela", "Rafa123");
            Person  pessoa2   = new Person(2, "Paulo", "Paulo123");
            Person  pessoa3   = new Person(3, "Maria", "Maria123");

            Message mensagem1 = new Message(1,"ola, amiga! como vai você?", pessoa1);
            System.out.println(mensagem1);
            Message mensagem2 = new Message(2, "Eu não vou na faculdade amanha", pessoa2);
            System.out.println(mensagem2);
            Message mensagem3 = new Message(3, "Eu quero um celular novo!", pessoa3);
            System.out.println(mensagem3);

            Forum forum1 = new Forum(1, "Ana", "www.fatecfranca.com");
            forum1.addMessage(mensagem1);
            forum1.addMessage(mensagem2);
            System.out.println(forum1);
        }
    }


