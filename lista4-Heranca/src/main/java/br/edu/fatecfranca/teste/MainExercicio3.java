package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio3.Produto;
import br.edu.fatecfranca.exercicio3.Radio;
import br.edu.fatecfranca.exercicio3.Tv;

public class MainExercicio3 {
    public static void main(String[] args) {
        Produto produto;
        produto = new Radio(12345, 10, 94.9, "FM");
        produto.testaUnidade(); // Testa o produto usando polimorfismo
        System.out.println(produto); // chama toString da classe radio

        produto = new Tv(54321, 20, 5);
        produto.testaUnidade();// Testa o produto usando polimorfismo
        System.out.println(produto);// chama toString da classe radio

    }
}

