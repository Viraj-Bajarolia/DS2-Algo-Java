# Receipt Homework Project

## Overview

This Java project models a receipt system using multiple classes. The program includes a `LineItem` class for individual items, a `Receipt` class for a full store receipt, and a `DigitalReceipt` class that extends `Receipt` by adding an email address.

## What the Project Does

The project allows a receipt to store different items, calculate the total amount spent, compare items, and check if certain items appear consecutively. It also shows how a digital receipt can reuse the same features as a regular receipt while adding extra information, such as the customer’s email address.

## What I Learned

Through this project, I learned how to design classes in Java using object-oriented programming. I practiced writing constructors, including overloaded constructors that reduce repeated code by calling another constructor with default values.

I also learned how to use encapsulation by keeping instance variables private and using methods to access or update data safely. Another important part of this project was overriding the `equals` method so that objects could be compared based on their actual data instead of just their memory location.

This assignment also helped me understand inheritance better. The `DigitalReceipt` class extends the `Receipt` class, which allowed me to reuse existing code instead of rewriting the same information again. I learned that inheritance is useful when one class is a more specific version of another class.

Finally, I practiced using arrays, loops, and conditional statements to solve problems, such as calculating the total receipt price and checking for repeated items in a row. Overall, this project helped me understand how different Java concepts work together in a real class design.
