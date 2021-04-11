package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PyramidTest {
    private static Pyramid p1;
    private static Pyramid p2;
    private static Pyramid p3;
    private static Pyramid p4;
    @BeforeAll
    public static void setUp() {

        p1 = new Pyramid();
        p2 = new Pyramid(14.5,14.5,14.5,20.0);
        p3 = new Pyramid(12.0,10.0,11.0,"Blue",15.0);
        p4 = new Pyramid("Red");
    }
    @Test
    public void shouldCalculateArea() {
        assertEquals(0, (int) p1.getArea());
        assertEquals(105, (int) p2.getArea());
        assertEquals(60, (int) p3.getArea());
    }
    @Test
    public void shouldCalculateVolume() {
        assertEquals(0, (int) p1.getArea());
        assertEquals(290, (int) p2.getArea());
        assertEquals(1020, (int) p3.getArea());

    }

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(45, (int) p1.getPerimeter());
        assertEquals(43, (int) p2.getPerimeter());
        assertEquals(64, (int) p3.getPerimeter());
    }
    @Test
    public void shouldPrintPyramid() {
        assertEquals("This is a Pyramid with color NONE side1 1.0 side2 1.0 and side3 1.0", p1.toString());
        assertEquals("This is a Pyramid with color NONE side1 14.5 side2 14.5 and side3 14.5", p2.toString());
        assertEquals("This is a Pyramid with color Blue side1 12.0 side2 10.0 and side3 11.0", p3.toString());
        assertEquals("This is a Pyramid with color Red side1 0.0 side2 0.0 and side3 0.0", p4.toString());
    }
    @Test
    public void shouldPrintTriangle3D() {

        assertTrue(p1.toStringGeometricShape3D().contains("This is a Pyramid"));
        assertTrue(p2.toStringGeometricShape3D().contains("This is a Pyramid"));
        assertTrue(p3.toStringGeometricShape3D().contains("This is a Pyramid"));
        assertTrue(p4.toStringGeometricShape3D().contains("This is a Pyramid"));
    }

}

