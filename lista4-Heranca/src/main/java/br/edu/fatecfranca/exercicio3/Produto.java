package br.edu.fatecfranca.exercicio3;

public abstract class Produto {
    protected String result;
    protected int serial, volume;
    protected boolean testado;
    public Produto() {
    }

    public Produto(int serial, int volume) {
        this.result= "Não-testado";
        this.setVolume(volume);
        this.volume = volume;
        this.testado = false;
    }

    public boolean testaUnidade() {
        if (!testado) {
            // 90% de chance do produto estar OK
            double chance = Math.random();
            if (chance <= 0.9) {
                result = "aprovado";
                testado = true;
                return true;
            } else {
                result= "reprovado";
                testado = true;
                return false;
            }
        } else {
            // Se já foi testado, retorna o resultado anterior
            System.out.println("Este produto já foi testado.");
            return result.equals("aprovado");
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "result='" + result + '\'' +
                ", serial=" + serial +
                ", volume=" + volume +
                '}';
    }
}
