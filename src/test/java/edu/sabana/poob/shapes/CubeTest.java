package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubeTest {

    private static Cube c1;
    private static Cube c2;
    private static Cube c3;
    private static Cube c4;

    @BeforeAll
    public static void setUp() {
        c1 = new Cube();
        c2 = new Cube("Black",20.0);
        c3 = new Cube(25.0);
        c4 = new Cube("Red");
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(1, (int) c1.getArea());
        assertEquals(400, (int) c2.getArea());
        assertEquals(625, (int) c3.getArea());

    }
    @Test
    public void shouldCalculateVolume() {
        assertEquals(1, (int) c1.getVolume());
        assertEquals(8000, (int) c2.getVolume());
        assertEquals(15625, (int) c3.getVolume());

    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(12, (int) c1.getPerimeter());
        assertEquals(240, (int) c2.getPerimeter());
        assertEquals(300,(int) c3.getPerimeter());
        assertEquals(0, (int) c4.getPerimeter());
    }

   /* @Test
    public void shouldPrintCube() {


        assertEquals("This is a Cube with color NONE and width 1.0 and lenght 1.0", c1.toString());
        assertEquals("This is a Cube with color NONE and width 20.0 and lenght 20.0", c2.toString());
        assertEquals("This is a Cube with color Black and width 25.0 and lenght 25.0", c3.toString());
        assertEquals("This is a Cube with color Red and width 0.0 and lenght 0.0", c4.toString());
    }

    */

}
