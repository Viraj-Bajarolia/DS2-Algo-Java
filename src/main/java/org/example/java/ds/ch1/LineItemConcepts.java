package org.example.java.ds.ch1;

import java.util.ArrayList;
import java.util.List;

public class LineItemConcepts {
    public static void main (String[] args){
        String[] strings = new String[10];
        strings[5] = "abc";
        List<String> stringList = new ArrayList<>();
        String key1 = "Keyboard";
        double pricePerUnit = 55.5;
        int quantity = 3;
        LineItem keyboard = new LineItem (key1, pricePerUnit, quantity);
        LineItem keyboard2 = new LineItem (key1, pricePerUnit, quantity);
        LineItem mouse = new LineItem("Mouse", 199.2);
        System.out.println(keyboard.equals(keyboard2));
        System.out.println(mouse);

    }
}
