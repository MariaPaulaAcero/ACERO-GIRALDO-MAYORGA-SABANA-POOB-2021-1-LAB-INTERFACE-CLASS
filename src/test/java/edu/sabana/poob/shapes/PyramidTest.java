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
        p2 = new Pyramid("Red");
        p3 = new Pyramid(14.5,14.5,14.5,20.0);
        p4 = new Pyramid(12.0,10.0,11.0,"Blue",15.0);
    }
    @Test
    public void shouldCalculateVolume() {
        assertEquals(0, (int) p1.getArea());
        assertEquals(290, (int) p2.getArea());
        assertEquals(1020, (int) p3.getArea());
        assertEquals(3, (int) p4.getArea());

    }

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(45, (int) p1.getPerimeter());
        assertEquals(43, (int) p2.getPerimeter());
        assertEquals(64, (int) p3.getPerimeter());
        assertEquals(33, (int) p4.getPerimeter());
    }
    @Test
    public void shouldPrintPyramid() {
        assertEquals("This is a PyramidTest with color NONE side1 12.5 side2 12.5 and side3 20.0", p1.toString());
        assertEquals("This is a PyramidTest with color NONE side1 14.5 side2 14.5 and side3 14.5", p2.toString());
        assertEquals("This is a PyramidTest with color red side1 20.0 side2 24.0 and side3 20.0", p3.toString());
        assertEquals("This is a PyramidTest with color NONE side1 12.0 side2 10.0 and side3 11.0", p4.toString());
    }

}

