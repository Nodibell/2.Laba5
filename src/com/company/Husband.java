package com.company;

import java.util.ArrayList;

public class Husband extends Human {
    private double creditCard = 0;

    public double getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

    //husband checks the products from the list on possibility to buy in the shop he came to
        public void checkAndBuy(Shop list) {
            ArrayList<Product> forRemove = new ArrayList<>();
            for (Product product : shopList)
                for (int j = 0; j < list.shop.size(); j++) {
                    if ((list.showProductName(j) != null) && (list.showProductName(j).equals(product.getName()))) {
                        System.out.print("The product \"" + (product.getName()) + "\" was bought.\n");
                        buyProduct(list.sellProduct(j));
                        forRemove.add(product);
                    }
                }
            cleanBoughtProducts(forRemove);
        if (!shopList.isEmpty()) {
            System.out.print("§œ∑ Husband: Unfortunately, I didn't buy: \n");
            for (Product product : shopList) {
                System.out.print("- " + product.getName() + "\n");
            }
        }
        System.out.print("Total spent: " + getCreditCard() + "\n");
    }

    //removes the products which were bought from the shopping list
    public void cleanBoughtProducts(ArrayList<Product> list){
        for (Product product:list) {
            for (int i = 0; i < shopList.size(); i++) {
                if (product.equals(shopList.get(i))){
                    shopList.remove(i);
                }
            }
        }
    }


    public void buyProduct(double price) {
        setCreditCard(getCreditCard() + price);
    }
}
