package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exemplo.CarItem;
import br.edu.fatecfranca.exemplo.Exemplo;
import br.edu.fatecfranca.exemplo.ShoppingCart;

public class MainExemplo {
    public static void main(String[] args) {
        Exemplo produto1 = new Exemplo(1, "monitor", 600);
        Exemplo produto2 = new Exemplo(2, "teclado", 140);
        Exemplo produto3 = new Exemplo(3, "mouse", 90);

        CarItem carItem1 = new CarItem(1, produto1, 5);
        System.out.println(carItem1);

        CarItem carItem2 = new CarItem(2, produto1, 6);
        System.out.println(carItem2);

        CarItem carItem3 = new CarItem(3, produto2, 10);
        System.out.println(carItem3);

        CarItem carItem4 = new CarItem(4, produto2, 15);
        System.out.println(carItem4);

        CarItem carItem5 = new CarItem(5, produto3, 20);
        System.out.println(carItem5);

        ShoppingCart carrinho1 = new ShoppingCart(1, "crédito", "Franca");
        carrinho1.addCarItem(1, 5, produto1);
        carrinho1.addCarItem(3, 10, produto2);
        carrinho1.calculatePrice();
        System.out.println(carrinho1.toString());

        ShoppingCart carrinho2 = new ShoppingCart(2, "pix", "Batatais");
        carrinho2.addCarItem(2,6,produto1);
        carrinho2.addCarItem(5,20,produto3);
        carrinho2.calculatePrice();
        System.out.println(carrinho2.toString());
    }
}