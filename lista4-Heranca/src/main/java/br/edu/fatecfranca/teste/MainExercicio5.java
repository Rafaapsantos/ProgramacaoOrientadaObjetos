package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio5.Conta;

public class MainExercicio5 {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Rafaela", 123456,
                5000.0f, 10000.0f, 4000.0f);
        conta1.deposito(5000.0f);
        conta1.retira(1000.0f);
        conta1.mostraSaldo(conta1);

        Conta conta2 = new Conta("Higor", 654321,
                4000.0f, 5000.0f, 5000.0f);
        conta2.deposito(1000.0f);
        conta2.retira(100.0f);
        conta2.mostraSaldo(conta2);

    }
}
