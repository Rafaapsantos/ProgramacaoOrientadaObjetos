package br.edu.fatecfranca.exercicio1;

public class Cidade {
    public void contrata(IProfessor p){
        p.ensina();
        p.trabalha();
    }

    public void contrata(IEmpregado e){
        e.trabalha();
    }

    public void cobraDe(IContribuinte c) {
        c.pagaIR();
    }

    public void registra(ICidadao c) {
        c.getRg();
    }

    public void alimenta(Animal a ){
        a.come();
    }

}
