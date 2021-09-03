package com.codedifferently.vendingmachine;

import org.junit.Assert;
import org.junit.Test;

public class ConsoleTest {

    @Test
    public void selectButtonTest1(){
        Console console = new Console();
        String expected = "Refund";
        String actual = console.selectButton(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectButtonTest2(){
        Console console = new Console();
        String expected = "3";
        String actual = console.selectButton(3);
        Assert.assertEquals(expected, actual);
    }

}
