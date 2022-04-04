package com.company;

/*Лабораторна робота №5
Тема: «Програма Shopping.»
Є набір найменувань товарів, які необхідно купити.
Є магазин побутової техніки та магазин продуктів, кожен зі своїм асортиментом
товарів, що містять назву і ціну. Вважаємо, що в різних магазинах не може бути
однакового товару.
Необхідно написати клас Wife, який буде передавати класу Husband список
необхідних товарів, отримувати від нього і виводити на екран:
• список всіх товарів всіх магазинів;
• список товарів з необхідного набору, які є у продажу;
• сумарну вартість передбачуваної покупки.
Наприклад: для списку необхідних товарів Sony, Bread, Lenovo, Onion програма повинна
вивести:
Total list:
Sony - 100
Samsung - 80
Sharp - 70
Apple - 300
Aser - 40
Bread - 110
Sausage - 80
Butter - 70
Milk - 300
Potato - 40
Bought:
Sony - 100
Bread - 110
Total price = 210
 */

public class Main {

    public static void main(String[] args) {
        Wife wife = new Wife();
        Husband husband = new Husband();
        Market market = new Market();
        TechShop techShop = new TechShop();

        //adding products to shops
        market.addProduct("water", 12.70);
        market.addProduct("bread", 21);
        market.addProduct("milk", 29.99);
        market.addProduct("flour", 32.40);
        market.addProduct("salt", 15.35);

        techShop.addProduct("Sony", 1050);
        techShop.addProduct("Samsung", 725);
        techShop.addProduct("Xiaomi", 349);
        techShop.addProduct("Huawei", 655);
        techShop.addProduct( "Nokia", 125);

        //adding products which we need to buy
        wife.addProductToShopList("potato");
        wife.addProductToShopList("Samsung");
        wife.addProductToShopList("flour");
        wife.addProductToShopList("Nokia");
        wife.addProductToShopList("salt");
        wife.sendListTo(husband);

        //husband goes to shops
        System.out.println("∆∆∆\\ Coming to the market /∆∆∆");
        market.printList();
        husband.checkAndBuy(market);

        System.out.print("øøø Coming to the TechShop æææ\n");
        techShop.printList();
        husband.checkAndBuy(techShop);

        //wife checks if everything was bought
        wife.checkIfNotBought(husband);
    }
}
