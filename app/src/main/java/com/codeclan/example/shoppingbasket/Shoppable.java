package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 10/06/2017.
 */

public interface Shoppable {

    boolean addItem(Item item);
    boolean removeItem(Item item);
    boolean emptyBasket();
    int getValue();

}
