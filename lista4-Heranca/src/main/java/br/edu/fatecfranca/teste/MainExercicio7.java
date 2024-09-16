package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio5.Conta;
import br.edu.fatecfranca.exercicio7.Cartao;

public class MainExercicio7 {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Rafaela", 123456,
                5000.0f, 10000.0f, 4000.0f);
        Cartao cartao1 = new Cartao(conta1, 123456);
        cartao1.alteraSenha(123456, 654321);
        cartao1.consultaSaldo(654321);
        cartao1.retirada(100.0f,654321);
        cartao1.consultaSaldo(123456);
    }
}
