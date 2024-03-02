package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<>();
	
	// constructor
	public IntegerSet() {
	}
	
	// constructor with an array list
	public IntegerSet(ArrayList<Integer> set) {
		this.set = new ArrayList <> (set);
	}
	
	// create the set
	public void clear () {
		set.clear();
	}
	
	// Returns the size of the set
	public int length () {
		return set.size();
	}
	
	// Checks if the set contains a value
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set
    public int largest() throws IntegerSetException {
        if (isEmpty()) {
        	// Throws an exception if set is empty
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.max(set);
    }

    // Returns the smallest item in the set
    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
        	// Throws an exception if set is empty
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.min(set);
    }

    // Adds an item to the set if not already present
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set if not present
    public void remove(int item) {
        set.remove((Integer) item);
    }

    // Checks if the current set is equal to another set
    public boolean equals(IntegerSet otherSet) {
        if (this.set.size() != otherSet.set.size()) {
            return false;
        }
        for (int item : set) {
            if (!otherSet.contains(item)) {
                return false;
            }
        }
        return true;
    }

    // Performs the union of the current set with another set
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    // Performs the intersection of the current set with another set
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Calculates the difference of the current set with another set
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }
    // If set is empty, returns true; otherwise, returns false
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Returns a string representation of the set
    @Override
    public String toString() {
        return set.toString();
    }
}

// Custom exception class
class IntegerSetException extends Exception {
	public IntegerSetException(String message) {
        super(message);
    }
}
