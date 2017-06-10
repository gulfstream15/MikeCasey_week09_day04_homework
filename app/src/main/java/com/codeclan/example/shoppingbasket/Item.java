package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 10/06/2017.
 */

public class Item {

    private String name;
    private double price;
    private int quantity;
    private boolean offer;

//    public Item(String cornflakes, double v, int i, boolean b) {
//    }

    public void Item(String name, double price, int quantity, boolean offer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.offer = offer;
    }

}
