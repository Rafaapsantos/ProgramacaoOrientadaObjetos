package br.edu.fatecfranca.exercicio3;

public class Tv extends Produto{
    private int canal; // Ex: 5

    public Tv(int numeroSerial, int volume, int canal) {
        super(numeroSerial, volume);
        this.canal = canal;
    }

    // Método para assistir TV
    public String assistir() {
        return "Você está assistindo o canal " + canal;
    }

    // Método para trocar de canal
    public void trocaCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    // Sobrescreve o toString para incluir o canal
    @Override
    public String toString() {
        return super.toString() + ", Canal=" + canal;
    }
}
