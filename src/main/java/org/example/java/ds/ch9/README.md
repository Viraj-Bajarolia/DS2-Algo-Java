# Search and Sort Homework

This project is for the search and sort homework.

The main part of the assignment was to write methods that calculate how sorted a set of data is. The program checks neighboring values and counts how many are already in ascending order.

## Files

* `SearchSortHomeworkDriver.java` - contains the homework methods and the test code
* `Node.java` - node class used for the linked list part

## What the program does

There are two sortedness methods.

The first method checks an array of `Comparable` values.

The second method checks a linked list of nodes. I used recursion for this version.

The sortedness result is returned as a decimal from 0 to 1.

For example:

* `1.0` means the data is completely sorted
* `0.75` means 75% of the neighboring values are in order
* `0.0` means none of the neighboring values are in order

The homework also included tracing Shell sort, merge sort, and binary search.

## Running the program

Open the project in IntelliJ and run:

`SearchSortHomeworkDriver.java`

The driver includes tests for the sortedness methods.
