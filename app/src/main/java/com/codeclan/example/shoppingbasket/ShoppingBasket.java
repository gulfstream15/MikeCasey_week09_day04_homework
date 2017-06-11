package com.codeclan.example.shoppingbasket;

import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by user on 10/06/2017.
 */

public class ShoppingBasket implements Shoppable{

    private String customerName;
    private Integer itemId;

    HashMap<Integer, Item> basket = new HashMap<Integer, Item>();
    Customer customer = new Customer(customerName);
    Item itemOne = new Item("Cornflakes", 3, 2, true);

    public ShoppingBasket(String customerName) {
        this.customerName = customerName;
        this.itemId = itemId;
    }

    public void addItem(Integer itemId, Item item) {
        basket.put(itemId, item);
    }

    public void removeItem(Integer itemId) {
        basket.remove(itemId);
    }

    public void emptyBasket() {
        basket.clear();
    }

    public int getBasketSize() {
        int sizeBasket = basket.size();
        return sizeBasket;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String newCustomerName) {
        this.customerName = newCustomerName;
    }

    public boolean getCustomerLoyalty() {
        boolean customerLoyalty = customer.getLoyalty(customerName);
        return customerLoyalty;
    }

    public int getBasketValue() {
        return 10;
    }

//    public boolean getItemTwoForOneOffer(Item item) {
//        boolean itemOffer = item.getTwoForOneOffer(item);
//        return itemOffer;
//    }

}
