package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.Exercicio3;

public class MainExe3 {
    public static void main(String[] args) {
        Exercicio3 testaProduto = new Exercicio3(1, "produto de beleza", 5,
                15.5f);
        testaProduto.comprar(3);
        testaProduto.vender(2);
        testaProduto.subir(2.5f);
        testaProduto.descer(5.0f);
        System.out.println(testaProduto.mostra());

        Exercicio3 testaProduto2 = new Exercicio3();
        testaProduto2.comprar(3);
        testaProduto2.vender(2);
        testaProduto2.subir(2.5f);
        testaProduto2.descer(5.0f);
        System.out.println(testaProduto2.mostra());

    }
}
