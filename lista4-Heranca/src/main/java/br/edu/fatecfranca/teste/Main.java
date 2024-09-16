package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exemplo.Assistente;
import br.edu.fatecfranca.exemplo.Diretor;
import br.edu.fatecfranca.exemplo.Funcionario;
import br.edu.fatecfranca.exemplo.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void calculaFolhaDePagamento(List<Funcionario> funcs){
        float soma = 0;
        for (Funcionario func : funcs){
            func.calcularSalario();
            soma += func.calcularSalario();
        }
        System.out.println("O Total da folha de pagamento é: R$"+ soma);
    }
    public static void polimorfismo(Funcionario funcionario) {
        System.out.println(funcionario.toString());
    }
    public static void main(String[] args) {
        //Funcionario funcionario1 = new Funcionario() ----> NÃO PODE FAZER ISSO QUANDO A CLASSE É ABSTRATA

        Assistente assistente1 = new Assistente("Rafaela", "Franca",
                "123.456.789-0", 3000,0);
        polimorfismo(assistente1);

        Gerente gerente1 = new Gerente("Ana", "Batatais",
                "321.654.987-1",5000,3000);
        polimorfismo(gerente1);

        Diretor diretor1 = new Diretor("Higor", "Ribeirão Preto",
                "987.654.321-2", 8000, 1000);
        polimorfismo(diretor1);

        List<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(assistente1);
        funcs.add(gerente1);
        funcs.add(diretor1);
        calculaFolhaDePagamento(funcs);
    }

}