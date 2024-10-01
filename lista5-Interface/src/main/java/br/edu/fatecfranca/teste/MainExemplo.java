package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exemplo.*;

public class MainExemplo {
    public static void main(String[] args) {
        IJogadorVolei obj1 = new AtletaVolei();
        obj1.sacar();
        obj1.levantar();

        IjogadorBasquete obj2 = new AtletaBasquete();
        obj2.arremessar();
        obj2.cobrarLanceLivre();

        IJogadorFutebol obj3 = new AtletaFutebol();
        obj3.baterPenalti();
        obj3.baterEscanteio();

        IjogadorBasquete obj4 = new AtletaBasqueteVolei();
        obj4.cobrarLanceLivre();
        obj4.arremessar();

        IJogadorVolei obj5 = new AtletaBasqueteVolei();
        obj5.sacar();
        obj5.levantar();


    }
}
