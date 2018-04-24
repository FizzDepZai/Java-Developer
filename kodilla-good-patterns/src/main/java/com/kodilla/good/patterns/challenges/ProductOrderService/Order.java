package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderTotalPrice() {
        return product.getPrice() * quantity;
    }
}
