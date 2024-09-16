package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio6.ContaEspecial;

public class MainExercicio6 {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial("Rafaela", 123456,
                5000.0f, 10000.0f, 16000.0f);
        conta1.deposito(5000.0f);
        conta1.retira(1000.0f);
        conta1.mostraSaldo(conta1);

        ContaEspecial conta2 = new ContaEspecial("Higor", 654321,
                4000.0f, 5000.0f, 2000.0f);
        conta2.deposito(1000.0f);
        conta2.retira(100.0f);
        conta2.mostraSaldo(conta2);

    }
}
