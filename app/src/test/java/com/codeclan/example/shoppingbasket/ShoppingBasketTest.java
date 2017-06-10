package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/06/2017.
 */

public class ShoppingBasketTest {

    @Before
    public void before(){
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
    }

    @Test
    public void canAddItem() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        Item item = new Item("Cornflakes", 3, 2, true);
        assertEquals(true, shoppingBasket.addItem(item));
    }

    @Test
    public void canRemoveItem() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        Item item = new Item("Cornflakes", 3, 2, true);
        assertEquals(true, shoppingBasket.removeItem(item));
    }

    @Test
    public void canEmptyBasket() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        assertEquals(true, shoppingBasket.emptyBasket());
    }

    @Test
    public void basketHasValue() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        assertEquals(10, shoppingBasket.getValue());
    }

}
