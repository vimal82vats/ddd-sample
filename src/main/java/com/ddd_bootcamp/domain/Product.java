package com.ddd_bootcamp.domain;

public class Product {
    String name;
    Price price;

    public Product(String name,Price price ) {
        this.name = name;
        this.price = price;
    }
    //public Product(){}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}