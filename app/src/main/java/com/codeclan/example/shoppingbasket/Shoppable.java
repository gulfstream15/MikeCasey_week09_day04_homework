package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 10/06/2017.
 */

public interface Shoppable {

    void addItem(Integer itemId, Item item);
    void removeItem(Integer itemId);
    void emptyBasket();
    int getBasketSize();
    int getBasketValue();

}
