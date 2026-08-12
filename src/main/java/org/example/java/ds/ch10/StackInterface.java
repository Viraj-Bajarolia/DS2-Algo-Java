package org.example.java.ds.ch10;

public interface StackInterface<T> {
    /**
     * Adds a new entry to the top of this stack.
     *
     * @param element element to be added to the stack
     */
    public void push(T element);


    public T pop();

    /**
     * Get the stack's top element. The size of the stack is not changed.
     *
     * @return The element at the top of the stack.

     */
    public T peek();

    /**
     * Determines if there are any elements in the stack.
     *
     * @return True if the stack is empty.
     */
    public boolean isEmpty();

    /** Removes all entries from the stack. */
    public void clear();

    /**
     * Get the element below the top element of the stack.
     * The size of the stack is not changed.
     *
     * @return The element at below the element at the top of the stack.
     */
    public T peekNext();
}
