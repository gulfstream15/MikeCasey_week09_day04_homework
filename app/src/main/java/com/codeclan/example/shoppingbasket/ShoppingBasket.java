package com.codeclan.example.shoppingbasket;

import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by user on 10/06/2017.
 */

public class ShoppingBasket implements Shoppable{

    private String customerName;
    private String itemId;
    HashMap basket = new HashMap();

    public ShoppingBasket(String customerName) {
        this.customerName = customerName;
    }

    public boolean addItem(Item item) {
        return true;
    }

    public boolean removeItem(Item item) {
        return true;
    }

    public boolean emptyBasket() {
        return true;
    }

    public int getValue() {
        return 10;
    }


}
