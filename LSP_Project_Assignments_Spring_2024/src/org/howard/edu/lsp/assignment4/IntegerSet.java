package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    public IntegerSet() {
    }

    /**
     * Constructs an IntegerSet with a specified list of integers.
     * @param set The list of integers to initialize the set.
     */
    
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears all elements from the set.
     */
    
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return The size of the set.
     */
    
    public int length() {
        return set.size();
    }

    /**
     * Checks if a specific value is present in the set.
     * @param value The integer value to check in the set.
     * @return true if the value is present, false otherwise.
     */
    
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * @return The largest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    
    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest element in the set.
     * @return The smallest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    
    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.min(set);
    }

    /**
     * Adds a new element to the set if it is not already present.
     * @param item The integer to add to the set.
     */
    
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an element from the set if it exists.
     * @param item The integer to be removed from the set.
     */
    
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Checks if this set is equal to another set.
     * @param otherSet The other IntegerSet to compare with.
     * @return true if both sets contain the same elements, false otherwise.
     */
    
    public boolean equals(IntegerSet otherSet) {
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    /**
     * Performs the union of this set with another set.
     * @param intSetb The other IntegerSet to perform the union with.
     */
    
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    /**
     * Performs the intersection of this set with another set.
     * @param intSetb The other IntegerSet to intersect with.
     */
    
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Calculates the difference of this set with another set.
     * @param intSetb The other IntegerSet to calculate the difference with.
     */
    
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise.
     */
    
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Provides a string representation of the set.
     * @return A string representing the elements of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }

    /**
     * Exception class for IntegerSet.
     */
    // Custom exception class
    public static class IntegerSetException extends Exception {
        public IntegerSetException(String message) {
            super(message);
        }
    }
}