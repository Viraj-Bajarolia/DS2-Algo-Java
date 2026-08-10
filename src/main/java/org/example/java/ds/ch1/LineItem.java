package org.example.java.ds.ch1;

import java.text.NumberFormat;

public class LineItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    private static final int DEFAULT_QUANTITY = 1;


    public LineItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public LineItem(String name, double pricePerUnit) {
        this(name, pricePerUnit, DEFAULT_QUANTITY);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        {
            if(quantity>=0) {
                this.quantity= quantity;
            } else {
                System.out.println("Error- quantity cannot be negative.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof LineItem)) {
            return false;
        }

        LineItem other = (LineItem) obj;

        return name.equalsIgnoreCase(other.name)
                && pricePerUnit == other.pricePerUnit
                && quantity == other.quantity;
    }

    @Override
    public String toString() {
        String priceString = NumberFormat.getCurrencyInstance().format(pricePerUnit);
        String tabString = "";
        if(name.length()<=4) {
            tabString = "\t\t";
        } else {
            tabString = "\t";
        }

        return name + tabString + "Price: " + priceString + "\tQuantity: " + quantity;
    }

}
