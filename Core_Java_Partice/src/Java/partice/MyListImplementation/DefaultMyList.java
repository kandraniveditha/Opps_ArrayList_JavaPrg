package Java.partice.MyListImplementation;

import java.util.Arrays;

public class DefaultMyList implements MyList {
    private Object[] elements;  // Array to store the list elements
    private int size;           // Number of elements currently in the list
    
    private static final int DEFAULT_CAPACITY = 10; // Initial capacity

    public DefaultMyList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(Object e) {
        if (e == null) {
            throw new NullPointerException("Cannot add null element");
        }
        ensureCapacity(); // Ensure the array has enough space
        elements[size++] = e; // Add the element and increase the size
    }

    @Override
    public void clear() {
        Arrays.fill(elements, 0, size, null); // Clear the array
        size = 0; // Reset size to 0
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException("Cannot remove null element");
        }
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                removeAt(i); // Remove the element at the found index
                return true;
            }
        }
        return false; // Element not found
    }

    private void removeAt(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1]; // Shift elements to the left
        }
        elements[--size] = null; // Nullify the last element and reduce size
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size); // Return a copy of the array
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            throw new NullPointerException("Cannot check for null element");
        }
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(MyList c) {
        Object[] otherArray = c.toArray(); // Convert the other list to an array
        for (Object element : otherArray) {
            if (!contains(element)) { // Check if each element is in the current list
                return false;
            }
        }
        return true;
    }

    // Ensure the internal array has enough capacity, double the size if needed
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}