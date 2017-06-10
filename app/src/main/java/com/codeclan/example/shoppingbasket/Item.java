package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 10/06/2017.
 */

public class Item {

    private String name;
    private int price;
    private int quantity;
    private boolean offer;

    public Item(String name, int price, int quantity, boolean offer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.offer = offer;
    }

    public String getName() {
            return this.name;
        }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;

    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;

    }

    public boolean getOffer() {
        return this.offer;
    }

    public void setOffer(boolean newOffer) {
        this.offer = newOffer;

    }
}
