package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio1.Cidade;
import br.edu.fatecfranca.exercicio1.IEmpregado;
import br.edu.fatecfranca.exercicio1.Pessoa;

public class MainExercicio1Cidade {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Cidade c1 = new Cidade();
        c1.alimenta(p1);
        c1.contrata(p1);
        c1.contrata((IEmpregado) p1);
        c1.registra(p1);
    }
}
