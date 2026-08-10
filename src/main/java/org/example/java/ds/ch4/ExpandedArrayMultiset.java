package org.example.java.ds.ch4;

import java.util.*;
/*
 * An expandable, array-based implementation of a multiset.
 */
class ExpandableArrayMultiset<T> extends ArrayMultiset<T> implements Multiset<T> {


    public ExpandableArrayMultiset(int capacity) {
        super(capacity);
        if(capacity<=0) {
            throw new IllegalArgumentException("Invalid Capacity of " + capacity);
        }
    }

    public ExpandableArrayMultiset() {
        super();
    }

    @Override
    public boolean add(T element) {
        if (isArrayFull()) {
            expandArray();
        }
        return super.add(element);
    }


    public boolean isFull() {
        return false;
    }


    public void trimToSize() {
        if (size() == 0) {
            setArray = Arrays.copyOf(setArray, 1);
        } else {
            setArray = Arrays.copyOf(setArray, size());
        }
    }

    private boolean isArrayFull() {
        return size()==setArray.length;
    }

    private void expandArray() {
        setArray = Arrays.copyOf(setArray, setArray.length * 2);

    }


}