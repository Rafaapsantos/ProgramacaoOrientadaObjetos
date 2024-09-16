package br.edu.fatecfranca.exercicio3;

public abstract class Produto {
    protected int serial, volume;
    protected String teste;
    public Produto() {
        this.serial = 0;
        this.volume = 0;
        this.teste= "Não-testado";
    }

    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "Não-testado";
    }

    public void testaUnidade() {
        if (this.teste.equals("Não-testado")) {
            int chance = (int) (Math.random() * 10); //gera numero de 0 a 9
            if (chance == 0) { //10%
                this.teste = "reprovado";
            } else { //90%
                this.teste = "aprovado";
            }
        } else {
            System.out.println("Este produto já foi testado.");
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return this.volume;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
