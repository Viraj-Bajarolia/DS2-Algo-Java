package org.example.java.ds.ch2;

public class Trio<T> {

    private T item1;
    private T item2;
    private T item3;

    public Trio(T item1, T item2, T item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public Trio(T item) {
        this(item, item, item);
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public T getItem3() {
        return item3;
    }

    public void setItem3(T item3) {
        this.item3 = item3;
    }

    public void replaceAll(T item) {
        item1 = item;
        item2 = item;
        item3 = item;
    }

    public boolean hasDuplicates() {
        return item1.equals(item2) || item1.equals(item3) || item2.equals(item3);
    }

    public int count(T item) {
        int count = 0;

        if (item1.equals(item)) {
            count++;
        }

        if (item2.equals(item)) {
            count++;
        }

        if (item3.equals(item)) {
            count++;
        }

        return count;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Trio)) {
            return false;
        }

        Trio<T> other = (Trio<T>) obj;

        return count(item1) == other.count(item1)
                && count(item2) == other.count(item2)
                && count(item3) == other.count(item3);
    }

    public String toString() {
        return "(" + item1 + ", " + item2 + ", " + item3 + ")";
    }
}