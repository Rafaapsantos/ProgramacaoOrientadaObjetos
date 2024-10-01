package br.edu.fatecfranca.exemplo;

public class AtletaBasquete implements IjogadorBasquete{

    @Override
    public void arremessar() {
        System.out.println("Jogador de basquete arremessou...");
    }

    @Override
    public void cobrarLanceLivre() {
        System.out.println("Jogador de basquete cobrou Lance Livre...");
    }
}
