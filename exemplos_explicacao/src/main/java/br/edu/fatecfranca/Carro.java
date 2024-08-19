package br.edu.fatecfranca;

public class Carro {
    //declaração de variaveis
    public String marca, modelo, cor;
    public int ano;
    public float velocidadeAtual;

    //criando o metodo construtor e declarando os parametros do metodo
    public Carro(String marca, String modelo, String cor,int ano, float velocidadeAtual){
    // atribuindo os valores passados no parametro para o objeto que chama o construtor
        this.marca = marca;
        this.modelo = modelo;
        this.cor =cor;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }
    // criando um construtor vazio, ou ja atribuindo um valor
    public Carro(){
        this.marca= "não definido";
        this.modelo = "não definido";
        this.velocidadeAtual =0;
    }



    //metodo acelerar
    public void acelerar(float x){
        this.velocidadeAtual = this.velocidadeAtual+ x;
        System.out.println("O carro "+ this.marca + " Do modelo "+ this.modelo+ " esta acelerando com a velocidade " + this.velocidadeAtual);
    }
    //metodo frear
    public void frear(float y){
        if (velocidadeAtual >=y){
            this.velocidadeAtual = this.velocidadeAtual- y;
            System.out.println("O carro "+ this.marca + " Do modelo "+ this.modelo+ " esta freando com a velocidade " + this.velocidadeAtual);
        }else {
            System.out.println("obejeto não pode ter velocidade negativa");
        }

    }
    // converte objeto para string


    public String toString() {
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Cor: " + this.cor + " Ano: " + this.ano + " Velocidade: " + this.velocidadeAtual;
    }
}
