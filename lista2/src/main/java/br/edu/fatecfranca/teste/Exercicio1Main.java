package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe.Exercicio1;

public class Exercicio1Main {
    public static void main(String[] args) {
        //OPÇÃO 1
        Exercicio1 cliente1 = new Exercicio1();

        IllegalArgumentException e;
        try {
            cliente1.setNome("Rafaela Santos");
        } catch (IllegalArgumentException var1) {
            e = var1;
            System.out.println(e.getMessage());
        }

        try {
            cliente1.setNroAgencia("1234-6");
        } catch (IllegalArgumentException var2) {
            e = var2;
            System.out.println(e.getMessage());
        }

        try {
            cliente1.setNroConta("123456-8");
        } catch (IllegalArgumentException var3) {
            e = var3;
            System.out.println(e.getMessage());
        }

        try {
            cliente1.setSaldo(0.0F);
        } catch (IllegalArgumentException var4) {
            e = var4;
            System.out.println(e.getMessage());
        }

        cliente1.depositar(1000.0F);
        cliente1.sacar(300.0F);
        System.out.println(cliente1);

        //OPÇÃO 2
        Exercicio1 cliente2 = new Exercicio1("123456-7", "1234-5", "Carlos", 0.0F);

        cliente2.depositar(1000.0F);
        cliente2.sacar(1200.0F);
        System.out.println(cliente2);
    }
}
