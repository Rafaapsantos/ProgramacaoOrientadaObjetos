package br.edu.fatecfranca;

public class Exercicio4 {
    //variaveis
    public String nome;
    public float nivel;
    public boolean poluido;

    public Exercicio4(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public  Exercicio4(){
        this.nome = "sem nome";
        this.nivel = 0;
        this.poluido = false;
    }
    public void chover(float x){
        this.nivel += x;
        System.out.println("\nO nível do rio foi aumentado com sucesso");
    }
    public void ensolarar(float x){
        if (this.nivel > 0 && this.nivel >=x){
            this.nivel -= x;
            System.out.println("O nível do rio foi abaixado com sucesso");
        }else {
            System.out.println("O rio está seco. Não tem como diminuir");
        }

    }
    public void limpar(){
        if (!this.poluido){
            System.out.println("O rio ja esta limpo! Não precisa limpar novamente");
        }else {
            System.out.println("O rio foi limpo com sucesso!");
            this.poluido= false;
        }
    }
    public void sujar(){
        if (!this.poluido){
            System.out.println("O rio foi poluido com sucesso!");
            this.poluido= true;
        }else{
            System.out.println("O rio ja esta poluido! Não precisa poluir novamente");

        }
    }
    public String mostrar(){
        return "\nNome: " + nome + "\nNivel: " + nivel + "\nPoluido: " + poluido;
    }

}