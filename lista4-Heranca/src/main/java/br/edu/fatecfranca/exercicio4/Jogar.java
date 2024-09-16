package br.edu.fatecfranca.exercicio4;

import java.util.Random;

public class Jogar {
    private static final Random random = new Random();

    // Método para obter uma "Coisa" aleatória
    public static Coisa sorteiaCoisa() {
        int escolha = random.nextInt(3); // Gera um número entre 0 e 2
        switch (escolha) {
            case 0: return new Pedra();
            case 1: return new Papel();
            case 2: return new Tesoura();
            default: return null;
        }
    }

    // Método para jogar o jogo
    public static void jogar1() {
        Coisa c1 = sorteiaCoisa();
        Coisa c2 = sorteiaCoisa();

        System.out.println("Jogador 1 escolheu: " + c1);
        System.out.println("Jogador 2 escolheu: " + c2);

        if (c1.vence(c2)) {
            System.out.println(c1 + " vence " + c2);
        } else if (c2.vence(c1)) {
            System.out.println(c2 + " vence " + c1);
        } else {
            System.out.println("Empate!");
        }
    }
    public void jogar(){
        while (true) {
            jogar1();
            break;
        }
    }
}
