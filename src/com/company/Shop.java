package com.company;

import java.util.ArrayList;

abstract class Shop {
    ArrayList<Product> shop = new ArrayList<>();

    void addProduct (String name, double price){
        shop.add(new Product(name, price));
    }
    String showProduct(int i){
        return shop.get(i).getName();
    }

    double sellProduct(int i){
        return shop.get(i).getPrice();
    }

    void printList() {
        int i = 0;
        for (Product product : shop) {
            System.out.println("- Index " + i + ": " + product.toString());
            i++;
        }
    }
}
