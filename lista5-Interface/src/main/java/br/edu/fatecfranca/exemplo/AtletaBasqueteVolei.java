package br.edu.fatecfranca.exemplo;

public class AtletaBasqueteVolei implements IJogadorVolei, IjogadorBasquete{

    @Override
    public void sacar() {
        System.out.println("Jogador de volei sacando....");
    }

    @Override
    public void levantar() {
        System.out.println("Jogador de volei levantando....");
    }

    @Override
    public void arremessar() {
        System.out.println("Jogador de basquete arremessou...");
    }

    @Override
    public void cobrarLanceLivre() {
        System.out.println("Jogador de basquete cobrou Lance Livre...");
    }
}
