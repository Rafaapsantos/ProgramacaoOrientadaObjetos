package br.edu.fatecfranca.exemplo;

import java.util.ArrayList;
import java.util.List;

// Classe que representa o carrinho de compras
public class ShoppingCart {
    private int id;
    private double price;
    private String endereco;
    private String formaDePagamento;
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.formaDePagamento = "";
        this.endereco = "";
        this.carItens = new ArrayList<>();
    }

    public ShoppingCart(int id, String formaDePagamento, String endereco) {
        this.id = id;
        this.price = 0;
        this.formaDePagamento = formaDePagamento;
        this.endereco = endereco;
        this.carItens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", price=" + price +
                ", endereco='" + endereco + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", carItens=" + carItens +
                '}';
    }

    // Método para adicionar um item ao carrinho
    public void addCarItem(int id, int quantity, Exemplo product) {
        carItens.add(new CarItem(id, product, quantity));
    }

    // Método que calcula o valor total do carrinho
    public void calculatePrice() {
        double total = 0;
        for (CarItem carItem : carItens) {
            total += carItem.getQuantity() * carItem.getProduct().getPrice();
        }
        this.price = total;
    }
}

