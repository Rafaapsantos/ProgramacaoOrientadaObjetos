package br.edu.fatecfranca.exemplo;

// Classe que representa um item no carrinho de compras
public class CarItem {
    private int id;
    private int quantity;
    private Exemplo product;

    public CarItem(int id, Exemplo product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exemplo getProduct() {
        return product;
    }

    public void setProduct(Exemplo product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}