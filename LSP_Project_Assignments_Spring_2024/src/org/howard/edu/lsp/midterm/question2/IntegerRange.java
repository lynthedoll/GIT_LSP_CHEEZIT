package org.howard.edu.lsp.midterm.question2;

import java.util.HashSet;
import java.util.Set;

public class IntegerRange implements range {
    private int lowerBound;
    private int upperBound;

    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(range other) {
        for (int i = other.getLowerBound(); i <= other.getUpperBound(); i++) {
            if (this.contains(i)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegerRange)) {
            return false;
        }
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }
}