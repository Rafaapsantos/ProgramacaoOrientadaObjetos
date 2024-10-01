package br.edu.fatecfranca.exemplo;

public class AtletaFutebol implements IJogadorFutebol{

    @Override
    public void baterPenalti(){
        System.out.println("Jogador de futebol fazendo Penalti");
    }
    @Override
    public void baterEscanteio(){
        System.out.println("Jogador de futebol batendo Escanteio");
    }
}
