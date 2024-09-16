package br.edu.fatecfranca.exercicio7;

import br.edu.fatecfranca.exercicio5.Conta;

public class Cartao {
    private Conta conta;
    private int senha;

    public Cartao() {
    }

    public Cartao(Conta conta, int senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean retirada(float valor, int senha) {
        if (this.senha == senha) {
            this.conta.retira(valor);
        }else {
            System.out.println("Senha incorreta. Retirada não permitida.");
        }
        return false;
    }

    public void consultaSaldo(int senha){
        if (this.senha == senha) {
            conta.mostraSaldo(this.conta);
        }else {
            System.out.println("Senha incorreta. Consulta de saldo não permitida.");
        }
    }

    public void alteraSenha(int senhaAntiga, int senhaNova){
        if (this.senha == senhaAntiga) {
            this.senha = senhaNova;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Senha antiga incorreta. Alteração de senha não permitida.");
        }
    }


}
