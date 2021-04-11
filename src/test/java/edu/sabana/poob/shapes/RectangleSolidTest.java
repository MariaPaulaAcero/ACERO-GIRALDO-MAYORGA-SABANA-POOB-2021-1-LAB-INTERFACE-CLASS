package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleSolidTest {

    private static RectangleSolid r1;
    private static RectangleSolid r2;
    private static RectangleSolid r3;
    private static RectangleSolid r4;

    @BeforeAll
    public static void setUp() {
        r1 = new RectangleSolid();
        r2 = new RectangleSolid(14.5,20.0,24.0);
        r3 = new RectangleSolid(24.0,26.0,"blue",28.0);
        r4 = new RectangleSolid("Red");
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(1, (int) r1.getArea());
        assertEquals(290, (int) r2.getArea());
        assertEquals(624, (int) r3.getArea());

    }
    @Test
    public void shouldCalculateVolume() {
        assertEquals(2, (int) r1.getVolume());
        assertEquals(500, (int) r2.getVolume());
        assertEquals(754, (int) r3.getVolume());

    }
    @Test
    public void shouldCalculateSuperficialArea() {
        assertEquals(4, (int) r1.getSuperficialArea());
        assertEquals(1000, (int) r2.getSuperficialArea());
        assertEquals(2400, (int) r3.getSuperficialArea());

    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(4, (int) r1.getPerimeter());
        assertEquals(69, (int) r2.getPerimeter());
        assertEquals(100, (int) r3.getPerimeter());
    }
    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(1, (int) r1.getDiagonal());
        assertEquals(5, (int) r2.getDiagonal());
        assertEquals(7, (int) r3.getDiagonal());
    }

    @Test
    public void shouldPrintRectangleSolid() {

        assertEquals("This is a RectangleSolid with color NONE and width 1.0 and lenght 1.0", r1.toString());
        assertEquals("This is a RectangleSolid with color NONE and width 14.5 and lenght 20.0", r2.toString());
        assertEquals("This is a RectangleSolid with color blue and width 24.0 and lenght 26.0", r3.toString());
        assertEquals("This is a RectangleSolid with color Red and width 0.0 and lenght 0.0", r4.toString());
    }
    @Test
    public void shouldPrintRectangleSolid3D() {
        assertTrue(r1.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        assertTrue(r2.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        assertTrue(r3.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        assertTrue(r4.toStringGeometricShape3D().contains("This is a RectangleSolid"));
        }

}
