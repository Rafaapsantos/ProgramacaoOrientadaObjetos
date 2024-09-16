package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio3.Produto;
import br.edu.fatecfranca.exercicio3.Radio;
import br.edu.fatecfranca.exercicio3.Tv;

public class MainExercicio3 {
    public static void main(String[] args) {
        // Cria uma instância de Rádio e uma de TV
        Radio produto1 = new Radio(12345, 10, 94.9, "FM");
        Tv produto2 = new Tv(54321, 20, 5);

        // Testa ambos os produtos usando polimorfismo
        produto1.testaUnidade();
        produto2.testaUnidade();

        produto1.toString();
        produto2.toString();

        // Após o teste, permite alterar valores

    }
}

