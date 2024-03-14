package org.howard.edu.lsp.midterm.question2;

public interface range {
    boolean contains(int value);
    boolean overlaps(range other);
    int size();
}
