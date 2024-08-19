package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.Exercicio2;

import javax.swing.*;

public class MainExe2 {
    public static void main(String[] args) {
        Exercicio2 testaCliente = new Exercicio2(5,10,"fulano",
                9000.0f);
        testaCliente.realizarDeposito(1000);
        testaCliente.realizarSaque(500);
        System.out.println(testaCliente.dadosCliente());


        Exercicio2 testaCliente2 = new Exercicio2(10,60, "Beltrano",
                500.0f);
        // isso serve para a pessoa poder digitar o que ela quiser.
        String deposito = JOptionPane.showInputDialog("Informe valor do depósito");
        // converte String em float
        testaCliente2.realizarDeposito(Float.parseFloat(deposito));

        String saque = JOptionPane.showInputDialog("Informe valor do saque");
        // converte String em float
        testaCliente2.realizarSaque(Float.parseFloat(saque));
        JOptionPane.showMessageDialog(null, testaCliente2.dadosCliente());


        Exercicio2 testaCliente3 = new Exercicio2();
        testaCliente3.realizarDeposito(500);
        testaCliente3.realizarSaque(100);
        System.out.println(testaCliente3.dadosCliente());
    }
}
