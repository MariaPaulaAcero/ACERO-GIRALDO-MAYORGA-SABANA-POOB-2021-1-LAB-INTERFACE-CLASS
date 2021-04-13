package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {
    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;
    @BeforeAll
    public static void setUp() {

        t1 = new Triangle();
        t2 = new Triangle(14.5,14.5,14.5);
        t3 = new Triangle("red",20.0,24.0,20.0);
        t4 = new Triangle("blue");
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(0, (int) t1.getArea());
        assertEquals(105, (int) t2.getArea());
        assertEquals(240, (int) t3.getArea());

    }
    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(3, (int) t1.getPerimeter());
        assertEquals(43, (int) t2.getPerimeter());
        assertEquals(64, (int) t3.getPerimeter());

    }
    @Test
    public void shouldShowIfIsIsoceles() {
        Triangle triangle1 = new Triangle(12.5,12.5,20.0);
        assertTrue(triangle1.isIsosceles(), "isIsoceles");
    }

    @Test
    public void shouldShowIfIsEquilateral() {
        Triangle triangle1 = new Triangle(12.5,12.5,12.5);
        assertTrue(triangle1.isEquilateral(), "isEquilateral");
    }


    @Test
    public void shouldPrintTriangle() {
        assertEquals("This is a Triangle with color NONE side1 1.0 side2 1.0 and side3 1.0", t1.toString());
        assertEquals("This is a Triangle with color NONE side1 14.5 side2 14.5 and side3 14.5", t2.toString());
        assertEquals("This is a Triangle with color red side1 20.0 side2 24.0 and side3 20.0", t3.toString());
        assertEquals("This is a Triangle with color blue side1 0.0 side2 0.0 and side3 0.0", t4.toString());
    }
    @Test
    public void shouldPrintTriangle2D() {

        assertTrue(t1.toStringGeometricShape2D().contains("This is a Triangle"));
        assertTrue(t2.toStringGeometricShape2D().contains("This is a Triangle"));
        assertTrue(t3.toStringGeometricShape2D().contains("This is a Triangle"));
        assertTrue(t4.toStringGeometricShape2D().contains("This is a Triangle"));
    }

}

