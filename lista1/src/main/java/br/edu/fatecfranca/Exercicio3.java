package br.edu.fatecfranca;

public class Exercicio3 {
    //variaveis
    public int id;
    public String descricao;
    public int quatidade;
    public float preco;

    //construtores
    public Exercicio3(int id, String descricao, int quatidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quatidade = quatidade;
        this.preco = preco;
    }
    public Exercicio3(){
        this.id = 0;
        this.descricao = "sem descrição";
        this.quatidade = 0;
        this.preco = 0;
    }

    //metodos
    public void comprar(int x){
        this.quatidade += x;
        System.out.println("Compra realizada com sucesso!");
    }

    public void vender(int x){
        if (this.quatidade > 0 && this.quatidade >= x){
            this.quatidade -= x;
            System.out.println("Venda realizada com sucesso!");
        }else {
            System.out.println("Não tem produto suficiente para vender!");
        }
    }
    public void subir(float x){
        this.preco += x;
        System.out.println("Preço aumentado com sucesso!");
    }
    public void descer(float x){
        if (this.preco > 0 && this.preco >= x){
            this.preco -= x;
            System.out.println("Preço abaixado com sucesso!");
        }else{
            System.out.println("Não pode abaixar preços menores que 0 ou voce quer dar um desconto maior que o valor do produto");
        }

    }
    public String mostra(){
       return "ID: " + id + "\nDESCRIÇÃO: " + descricao + "\nQUATIDADE: " + quatidade + "\nPREÇO: " + preco + "\n";
    }
}
