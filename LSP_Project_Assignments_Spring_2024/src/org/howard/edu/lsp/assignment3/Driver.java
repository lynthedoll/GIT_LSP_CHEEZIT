package org.howard.edu.lsp.assignment3;

public class HelloWorld3 {

	public static void main(String[] args) {
		// initialize two sets for testing
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Initial Set1: " + set1.toString());
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Initial Set2: " + set2.toString());
		
		// test the add operation
		set1.add(4);
		System.out.println("After adding 4 to Set1: " + set1.toString());
		
		// test remove operation
		set1.remove(2);
		System.out.println("After removing 2 from Set1: " + set1.toString());
		
		// test equals operation
		boolean isEqual = set1.equals(set2);
		System.out.println("Set1 equals Set2? " + isEqual);
		
		// test contains
		boolean contains = set1.contains(3);
		System.out.println("Set1 contains 3? " + contains);
		
		// test largest and smallest
		try {
			System.out.println("Largest in Set1: " + set1.largest());
			System.out.println("Smallest in Set1: " + set1.smallest());
		} catch (Exception e) {
			System.out.println("Exception found: " + e.getMessage());
		}
		
		// test union operations
		set1.union(set2);
		System.out.println("Union of Set1 and Set2: " + set1.toString());
		
		// reset set1
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		// test intersection
		set1.intersect(set2);
		System.out.println("Intersection of Set1 and Set2: " + set1.toString());
		
		// reset set1 and set2
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.clear();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		// test difference
		set1.diff(set2);
		System.out.println("Difference of Set1 and Set2: " + set1.toString());
		
		// test isEmpty
		boolean isEmpty = set1.isEmpty();
		System.out.println("Set1 is empty? " + isEmpty);
		
		// test clear
		set1.clear();
		System.out.println("After clearing Set1: " set1.toString() + " (Should be empty)");	
		
		}
		
	}


