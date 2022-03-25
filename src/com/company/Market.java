package com.company;

public class Market extends Shop{
    @Override
    void printList() {
        System.out.print("$--Market--$: \n");
        super.printList();
    }
}
