package br.edu.fatecfranca;

public class Main {
    public static void main(String[] args) {
       //instancia 2 objetos
        Carro carro1 = new Carro("GM", "Onix", "Branco",2022, 0);
        Carro carro2 = new Carro("Fiat", "Palio", "preto",2019, 10);

        //instancia de um objeto que não vou passar nenhum parametro, ja vai ter um valor do parametro pré-definido
        Carro carro3= new Carro();

    // os metodos são chamados pelos objetos
        carro1.acelerar(50);
        carro1.frear(20);
        carro1.frear(20);
        carro1.frear(20);

        carro2.acelerar(40);
        carro2.frear(10);
        carro2.frear(15);
        carro2.frear(10);


        carro3.frear(5);

        System.out.println(carro1.toString());
        System.out.println("--------------");
        System.out.println(carro2.toString());
    }
}
