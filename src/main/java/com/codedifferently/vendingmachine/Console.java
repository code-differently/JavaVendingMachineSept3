package com.codedifferently.vendingmachine;

public class Console {
    private Button[] buttons;

    public Console(){
        buttons = new Button[7];
        for(int x = 0; x < 6; x++){
            buttons[x] = new Button(String.valueOf(x));
        }
        buttons[6] = new Button("Refund");
    }

    public String selectButton(Integer selection){
        String selected = buttons[selection].getAction();
        return selected;
    }
}
