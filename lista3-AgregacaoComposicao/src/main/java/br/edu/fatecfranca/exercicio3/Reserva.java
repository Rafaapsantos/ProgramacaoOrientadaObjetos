package br.edu.fatecfranca.exercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    private int id;
    private String data;
    private List<Passageiro> passageiros;
    private List<Voo> voos;

    public Reserva() {
        this.passageiros = new ArrayList<Passageiro>();
        this.voos=new ArrayList<Voo>();
    }

    public Reserva(int id, String data) {
        this.id = id;
        this.data = data;
        this.passageiros = new ArrayList<Passageiro>();
        this.voos=new ArrayList<Voo>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    public void addPassageiro(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }
    public void addVoo(Voo voo) {
        this.voos.add(voo);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", data=" + data +
                ", passageiros=" + passageiros +
                ", voos=" + voos +
                '}';
    }
}
