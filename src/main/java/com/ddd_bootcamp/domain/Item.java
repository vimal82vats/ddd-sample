package com.ddd_bootcamp.domain;

public class Item {
    Product product;
    int quantity;
    double totalAmount;

    public Item(Product product, int quantity) {
        super();
        this.product = product;
        this.quantity = quantity;
    }
    double getTotalAmount()	{
        return totalAmount;
    }
    void setTotalAmount(double totalAmount)	{
        this.totalAmount = totalAmount;
    }
}
