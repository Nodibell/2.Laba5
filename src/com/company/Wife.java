package com.company;

public class Wife extends Human {
    public void checkIfNotBought(Human list){
        if (!list.shopList.isEmpty()){
            System.out.print("!!! Wife: Is it too difficult for you to buy everything from this list?!!");
        } else {
            System.out.print("<3 Wife: Thanks, honey. I always knew that I can count on you!");
        }
    }
    @Override
    void sendListTo(Human list) {
        System.out.println("0<∑ Wife: Can you buy and fetch me products from this list?");
        super.printList();
        super.sendListTo(list);
    }
}
