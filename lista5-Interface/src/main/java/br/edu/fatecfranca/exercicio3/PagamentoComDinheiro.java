package br.edu.fatecfranca.exercicio3;

public class PagamentoComDinheiro extends PagamentoAdaptador {
    @Override
    public void pagarComDinheiro() {
        System.out.println("Pagamento realizado com dinheiro.");
    }
}
