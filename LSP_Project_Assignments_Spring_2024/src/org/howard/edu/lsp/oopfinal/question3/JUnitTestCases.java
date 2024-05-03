package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
    @Test
    public void testCreateCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        assertTrue(shape instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        assertTrue(shape instanceof Rectangle);
    }
}


