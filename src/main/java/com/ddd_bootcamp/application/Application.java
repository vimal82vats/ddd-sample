package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.*;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        //Product product = new Product("Apple Pencil");
        //ApplePencil
        Product product1 = new ApplePencil("Apple Pencil", new Price("12"));
        Product product2 = new ApplePencil("Sony Headphones", new Price("8"));

        Item item1 = new Item(product1, 2);
        Item item2 = new Item(product2, 3);

        Cart cart1 = new Cart();
        Product product3 = new ApplePencil("Sony Headphones", new Price("10"));

        Item item3 = new Item(product3, 2);
        cart1.add(item3);

        cart.add(item1);
        cart.add(item2);

        System.out.println("Cart = " + cart);
        List<Item> products = cart.getCartItem();

        System.out.println("----------------------------------------");
        System.out.println("products = " + products);
        System.out.println("----------------------------------------");

    }
}
