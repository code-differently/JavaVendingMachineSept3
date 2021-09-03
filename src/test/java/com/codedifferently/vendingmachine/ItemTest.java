package com.codedifferently.vendingmachine;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    @Test
    public void getNameTest(){
        // Given
        Item item = new Item("Fruit Snacks", 1.50);
        String expected = "Fruit Snacks";

        // When
        String actual = item.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest(){
        Item item = new Item ("Chips", .75);
        Double expected = .75;

        Double actual = item.getPrice();

        Assert.assertEquals(expected, actual);
    }
}
