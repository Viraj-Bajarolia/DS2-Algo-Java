package org.example.java.ds.ch3;


public class Person implements Comparable<Person> {

    private String firstName, lastName;
    private int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + id + ")";
    }


    @Override
    public int compareTo(Person other) {
        int lastCompare = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastCompare != 0) {
            return lastCompare;
        }

        int firstCompare = this.firstName.compareToIgnoreCase(other.firstName);
        if (firstCompare != 0) {
            return firstCompare;
        }

        return this.id - other.id;
    }
}
