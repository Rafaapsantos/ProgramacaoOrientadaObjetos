package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio3.Passageiro;
import br.edu.fatecfranca.exercicio3.Reserva;
import br.edu.fatecfranca.exercicio3.Voo;

public class MainExercicio3 {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro(1, "Rafaela Santos", "123.456.789-0");
        Passageiro passageiro2 = new Passageiro(2, "Ana Silva", "321.654.987-1");

        Voo voo1 = new Voo(1, "São Paulo", "Rio De Janeiro");
        Voo voo2 = new Voo(2, "Ribeirão Preto", "Porto Seguro");

        Reserva reserva1 = new Reserva(1, "03/09/2024");
        reserva1.addPassageiro(passageiro1);
        reserva1.addPassageiro(passageiro2);
        reserva1.addVoo(voo1);
        reserva1.addVoo(voo2);

        Reserva reserva2 = new Reserva(2, "10/10/2024");
        reserva2.addPassageiro(passageiro1);;
        reserva2.addVoo(voo2);
        System.out.println(reserva1);
        System.out.println(reserva2);
    }
}
