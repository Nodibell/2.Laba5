package com.company;
import java.util.ArrayList;

abstract class Human {
    ArrayList<Product> shopList = new ArrayList<>();

     ArrayList<Product> getShopList() {
        return shopList;
    }

    void sendListTo(Human list) {
        list.shopList.addAll(shopList);
    }

    void addProductToShopList(String item) {
        shopList.add(new Product(item, 0));
    }

    void printList() {
        int i = 0;
        for (Product product : shopList) {
            System.out.println("- Index " + i + ": " + product.getName());
            i++;
        }
    }
}
