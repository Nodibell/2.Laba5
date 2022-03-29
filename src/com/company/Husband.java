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
            for (Product value : shopList)
                for (int j = 0; j < list.shop.size(); j++) {
                    if (list.showProduct(j).equals(value.getName())) {
                        System.out.print("The product \"" + (value.getName()) + "\" was bought.\n");
                        buyProduct(list.sellProduct(j));
                        forRemove.add(value);
                    }
                }
            cleanerForList(forRemove);
        if (!shopList.isEmpty()) {
            System.out.print("§œ∑ Husband: Unfortunately, I didn't buy: \n");
            for (Product product : shopList) {
                System.out.print("- " + product.getName() + "\n");
            }
        }
        System.out.print("Total spent: " + getCreditCard() + "\n");
    }

    //removes the products which were bought from the shopping list
    public void cleanerForList (ArrayList<Product> list){
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
