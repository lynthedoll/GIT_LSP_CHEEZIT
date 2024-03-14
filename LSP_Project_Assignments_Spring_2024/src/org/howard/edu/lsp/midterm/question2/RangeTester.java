package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
    public static void main(String[] args) {
        // Test IntegerRange methods
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);

        System.out.println("Range 1 contains 3: " + range1.contains(3));
        System.out.println("Range 2 contains 8: " + range2.contains(8));
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2));
        System.out.println("Size of Range 1: " + range1.size());
        System.out.println("Range 1 equals Range 2: " + range1.equals(range2));
    }
}