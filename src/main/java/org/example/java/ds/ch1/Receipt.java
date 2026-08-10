package org.example.java.ds.ch1;

public class Receipt {

    private String id;
    private String store;
    private LineItem[] lineItems;

    public static final String DEFAULT_ID = "ID:X";
    public static final String DEFAULT_STORE = "Store: X";

    public Receipt(String id, String store, LineItem[] items) {
        this.id = id;
        this.store = store;
        this.lineItems = items;
    }
    public Receipt(LineItem[] items) {
        this(DEFAULT_ID, DEFAULT_STORE, items);
    }

    public String getId() {
        return id;
    }
    public String getStore() {
        return store;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }
    public double getTotalSpent() {
        double total = 0.0;

        for (int i = 0; i < lineItems.length; i++) {
            total += lineItems[i].getTotalPrice();
        }

        return total;
    }
    public boolean hasConsecutiveItems(String itemName, int timesRepeating) {
        int count = 0;

        for (int i = 0; i < lineItems.length; i++) {
            if (lineItems[i].getName().equalsIgnoreCase(itemName)) {
                count++;
            } else {
                if (count == timesRepeating) {
                    return true;
                }
                count = 0;
            }
        }

        return count == timesRepeating;
    }
    @Override
    public String toString() {
        String plural = lineItems.length >1 ? "s " : "  ";
        return "Receipt " + id + "\tStore: " + store + "\t" + lineItems.length + " item" + plural;
    }



}

