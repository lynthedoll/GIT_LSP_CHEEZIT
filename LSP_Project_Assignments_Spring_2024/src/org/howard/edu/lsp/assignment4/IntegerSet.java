package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    public IntegerSet() {
    }

    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    public void clear() {
        set.clear();
    }

    public int length() {
        return set.size();
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.max(set);
    }

    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("The set is empty.");
        }
        return Collections.min(set);
    }

    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    public void remove(int item) {
        set.remove((Integer) item);
    }

    public boolean equals(IntegerSet otherSet) {
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    // Custom exception class
    public static class IntegerSetException extends Exception {
        public IntegerSetException(String message) {
            super(message);
        }
    }
}