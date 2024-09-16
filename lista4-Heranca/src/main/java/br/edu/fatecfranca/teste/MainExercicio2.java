package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio2.Aniversario;
import br.edu.fatecfranca.exercicio2.CartaoWeb;
import br.edu.fatecfranca.exercicio2.DiaDosNamorados;
import br.edu.fatecfranca.exercicio2.Natal;

import java.util.ArrayList;
import java.util.List;

public class MainExercicio2 {
    public static void main(String[] args) {
        Aniversario aniversario1 = new Aniversario("Rafaela");
        Natal natal1 = new Natal("Ana");
        DiaDosNamorados diaDosNamorados1 = new DiaDosNamorados("Higor");
        Aniversario aniversario2 = new Aniversario("Jorge");
        Natal natal2 = new Natal("Maria");
        DiaDosNamorados diaDosNamorados2 = new DiaDosNamorados("Monica");

        List<CartaoWeb> cartaoWeb1 = new ArrayList<CartaoWeb>();
        cartaoWeb1.add(diaDosNamorados1);
        cartaoWeb1.add(aniversario1);
        cartaoWeb1.add(natal1);
        cartaoWeb1.add(diaDosNamorados2);
        cartaoWeb1.add(aniversario2);
        cartaoWeb1.add(natal2);

        for (CartaoWeb cartao : cartaoWeb1) {
            cartao.showMessage();//POLIMORFISMO
            //O polimorfismo acontece aqui, pois o metodo showMessage() é exibido de acordo com a instacia do array
        }
    }
}
