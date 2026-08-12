package org.example.java.ds.ch10;

public class FileItem {

    private String name;

    public FileItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
