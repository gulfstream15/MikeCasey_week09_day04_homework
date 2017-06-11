package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Ignore;
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
        Item item = new Item("Cornflakes", 3, 1, true);
        Integer itemId = 100;
        shoppingBasket.addItem(itemId,item);
        int sizeBasket = shoppingBasket.getBasketSize();
        assertEquals(1, sizeBasket);
    }

    @Test
    public void canRemoveItem() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 3, 2, true);
        Integer itemIdOne = 100;
        shoppingBasket.addItem(itemIdOne, itemOne);
        Item itemTwo = new Item("Rice Crispies", 2, 1, true);
        Integer itemIdTwo = 101;
        shoppingBasket.addItem(itemIdTwo, itemTwo);
        shoppingBasket.removeItem(itemIdTwo);
        assertEquals(1, shoppingBasket.getBasketSize());
    }

    @Test
    public void canEmptyBasket() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        Item itemOne = new Item("Cornflakes", 3, 2, true);
        Integer itemIdOne = 100;
        shoppingBasket.addItem(itemIdOne, itemOne);
        shoppingBasket.emptyBasket();
        assertEquals(0, shoppingBasket.getBasketSize());
    }

    @Test
    public void basketHasValue() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        int valueBasket = shoppingBasket.getBasketValue();
        assertEquals(10, valueBasket);
    }

    @Test
    public void basketHasCustomer() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        String basketCustomer = shoppingBasket.getCustomerName();
        assertEquals("Mike", basketCustomer);
    }

    @Test
    public void customerHasLoyalty() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
        String customerName = shoppingBasket.getCustomerName();
        Customer customer = new Customer(customerName);
        boolean customerLoyalty = customer.getLoyalty(customerName);
        assertEquals(true, customerLoyalty);
    }

    @Test
    public void customerHasNoLoyalty() {
        ShoppingBasket shoppingBasket = new ShoppingBasket("Bob");
        String customerName = shoppingBasket.getCustomerName();
        Customer customer = new Customer(customerName);
        boolean customerLoyalty = customer.getLoyalty(customerName);
        assertEquals(false, customerLoyalty);
    }

//    @Test
//    public void itemHasTwoForOneOffer() {
//        ShoppingBasket shoppingBasket = new ShoppingBasket("Mike");
//        assertEquals(true, itemOne.getTwoForOneOffer());
//    }

}
