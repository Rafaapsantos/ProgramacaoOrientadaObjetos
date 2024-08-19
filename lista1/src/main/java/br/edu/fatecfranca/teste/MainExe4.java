package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.Exercicio4;

public class MainExe4 {
    public static void main(String[] args) {
        Exercicio4 testaRio = new Exercicio4("tamandua", 500.0f , false);
        testaRio.chover(500.0f);
        testaRio.ensolarar(100.0f);
        testaRio.limpar();
        testaRio.sujar();
        System.out.println(testaRio.mostrar());

        Exercicio4 testaRio2 = new Exercicio4();
        testaRio.chover(500.0f);
        testaRio.ensolarar(100.0f);
        testaRio.limpar();
        testaRio.sujar();
        System.out.println(testaRio.mostrar());

    }
}
