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
        p2 = new Pyramid(14.0,14.5,14.0,20.0);
        p3 = new Pyramid(12.0,12.0,12.0,15.0,"Blue");
        p4 = new Pyramid("Red");
    }
    @Test
    public void shouldCalculateArea() {
        assertEquals(1, (int) p1.getArea());
        assertEquals(196, (int) p2.getArea());
        assertEquals(144, (int) p3.getArea());
    }
    @Test
    public void shouldCalculateVolume() {
        assertEquals(0, (int) p1.getVolume());
        assertEquals(1306, (int) p2.getVolume());
        assertEquals(720, (int) p3.getVolume());

    }
    @Test
    public void shouldCalculateSuperficialArea() {
        assertEquals(4, (int) p1.getSuperficialArea());
        assertEquals(10976, (int) p2.getSuperficialArea());
        assertEquals(6912, (int) p3.getSuperficialArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(4, (int) p1.getPerimeter());
        assertEquals(56, (int) p2.getPerimeter());
        assertEquals(48, (int) p3.getPerimeter());
    }
    @Test
    public void shouldPrintPyramid() {
        assertEquals("This is a Pyramid with color NONE side1 1.0 side2 1.0 and side3 1.0", p1.toString());
        assertEquals("This is a Pyramid with color NONE side1 14.0 side2 14.5 and side3 14.0", p2.toString());
        assertEquals("This is a Pyramid with color Blue side1 12.0 side2 12.0 and side3 12.0", p3.toString());
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

