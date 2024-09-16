package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exercicio1.Palco;

public class MainExercicio1 {
    public static void main(String[] args) {
        Palco palco = new Palco();
        palco.atuar();
        palco.altera();
        palco.atuar();
        palco.altera();
        palco.atuar();

    // 1°- Explique os resultados da execução do método
        // main abaixo e quais são os conceitos fundamentais
        // de orientação a objetos que são aplicados.
        //resposta:
        //Os conceitos usandos no código é a de classe abstratas
        // que não podem ser instanciadas na main, mas podem ser
        //usadas nas classes que herdam ela (AtorFeliz e AtorTriste).
        //tambem é usada o conceito de agregação, a classe Palco
        //recebe 1 ator, para varios palcos.
        //por ultimo é usado o conceito de polimosfismo, dentro da
        //classe Palco. o metodo atuar, é chamado ator.ato(),
        //dependendo de qual classe ele chamar a resposta vai ser
        //diferente.
        //Na main a classe Palco é instanciada, e pede para atuar(),
        //como na classe palco ator é = a AtorFeliz()
        //oq imprime é Ator feliz, quando pede para alterar()
        //na classe palco ator muda para =AtorTriste, e não imprime
        //nada, depois disso o metodo atuar() é chamado novamente,
        //e imprime Ator triste, pq foi mudado antes.
    }

}
