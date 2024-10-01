package br.edu.fatecfranca.exercicio3;

public class PagamentoComCartao extends PagamentoAdaptador {
    @Override
    public void pagarComCartao() {
        System.out.println("Pagamento realizado com cartão.");
    }
}