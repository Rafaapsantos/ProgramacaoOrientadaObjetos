package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio3.Pagamento;
import br.edu.fatecfranca.exercicio3.PagamentoComCartao;

public class MainExercicio3 {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoComCartao();
        pagamento.pagarComCartao();
    }
}
