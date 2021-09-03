package com.codedifferently.vendingmachine;

import org.junit.Assert;
import org.junit.Test;

public class ButtonTest {

    @Test
    public void getActionTest(){
        Button button = new Button("Refund");
        String expected = "Refund";

        String actual = button.getAction();

        Assert.assertEquals(expected, actual);
    }
}
