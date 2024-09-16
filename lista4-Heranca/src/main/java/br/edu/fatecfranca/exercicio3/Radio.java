package br.edu.fatecfranca.exercicio3;

public class Radio extends Produto{
    private double estacao;
    private String banda;

    public Radio() {
        super();
    }

    public Radio(int numeroSerial, int volume, double estacao, String banda) {
        super(numeroSerial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }

    public double getEstacao() {
        return estacao;
    }

    public void setEstacao(double estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    // Método para escutar a rádio
    public String escutar() {
        return "Você está ouvindo a estação " + estacao + " " + banda;
    }

    // Método para trocar a estação
    public void trocaEstacao(double novaEstacao) {
        this.estacao = novaEstacao;
    }

    // Método para trocar a banda
    public void trocaBanda(String novaBanda) {
        this.banda = novaBanda;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estação=" + estacao + " " + banda;
    }
}
