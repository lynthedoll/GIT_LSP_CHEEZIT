package org.howard.edu.lsp.oopfinal.question3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle and draw it
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Create a Rectangle and draw it
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}

