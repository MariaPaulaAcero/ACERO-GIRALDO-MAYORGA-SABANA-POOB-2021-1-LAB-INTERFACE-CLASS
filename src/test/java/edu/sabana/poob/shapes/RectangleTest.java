package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {

    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;

    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle();
        r2 = new Rectangle(14.5,20.0);
        r3 = new Rectangle("blue",25.5,40.0);
        r4 = new Rectangle("red");
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(1, (int) r1.getArea());
        assertEquals(290, (int) r2.getArea());
        assertEquals(1020, (int) r3.getArea());
        assertEquals(0, (int) r4.getArea());

    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(4, (int) r1.getPerimeter());
        assertEquals(69, (int) r2.getPerimeter());
        assertEquals(131, (int) r3.getPerimeter());
        assertEquals(0, (int) r4.getPerimeter());
    }
    @Test
    public void shouldCalculateDiagonal() {
        assertEquals(1, (int) r1.getDiagonal());
        assertEquals(5, (int) r2.getDiagonal());
        assertEquals(8, (int) r3.getDiagonal());
        assertEquals(0, (int) r4.getDiagonal());

    }

    @Test
    public void shouldPrintRectangle() {


        assertEquals("This is a Rectangle with color NONE and width 1.0 and lenght 1.0", r1.toString());
        assertEquals("This is a Rectangle with color NONE and width 14.5 and lenght 20.0", r2.toString());
        assertEquals("This is a Rectangle with color blue and width 25.5 and lenght 40.0", r3.toString());
        assertEquals("This is a Rectangle with color red and width 0.0 and lenght 0.0", r4.toString());
    }
    @Test
    public void shouldPrintRectangle2D() {
        assertTrue(r1.toStringGeometricShape2D().contains("This is a Rectangle"));
        assertTrue(r2.toStringGeometricShape2D().contains("This is a Rectangle"));
        assertTrue(r3.toStringGeometricShape2D().contains("This is a Rectangle"));
        assertTrue(r4.toStringGeometricShape2D().contains("This is a Rectangle"));
        }


}
