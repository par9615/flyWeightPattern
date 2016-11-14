package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 13/11/2016.
 */
public class TriangleTest {
    private static String COLOR_1 = "Red";
    private static String COLOR_2 = "Green";
    private static int SIDE1 = 1;
    private static int SIDE1_10 = 10;
    private static int SIDE2 = 2;
    private static int SIDE2_20 = 20;
    private static int SIDE3 = 3;
    private static int SIDE3_30 = 30;
    private static int X = 10;
    private static int Y = 10;
    private static String DRAW_RED = "Triangle: Draw() [Color : " + COLOR_1 + ", x : " + X + ", y :" + Y + ", side1 :" + SIDE1 + ", side2 :" + SIDE2 + ", side3 :" + SIDE3;
    private Triangle triangle;
    private ShapeFactory shapeFactory;

    @Before
    public void setUp() {
        triangle = (Triangle) shapeFactory.getTriangle(COLOR_1);
    }

    @Test
    public void testTriangleColorSetUp() {
        assertEquals(COLOR_1, triangle.color);
    }

    @Test
    public void testSide1SetUp() {
        Triangle triangle1 = (Triangle) shapeFactory.getTriangle(COLOR_2);
        assertEquals(SIDE1, triangle1.getSide1());
    }

    @Test
    public void testSide2SetUp() {
        Triangle triangle1 = (Triangle) shapeFactory.getTriangle(COLOR_2);
        assertEquals(SIDE2, triangle1.getSide2());
    }

    @Test
    public void testSide3SetUp() {
        Triangle triangle1 = (Triangle) shapeFactory.getTriangle(COLOR_2);
        assertEquals(SIDE3, triangle1.getSide3());
    }

    @Test
    public void testSetSide1() {
        triangle.setSide1(SIDE1_10);
        assertEquals(SIDE1_10, triangle.getSide1());
    }

    @Test
    public void testSetSide2() {
        triangle.setSide2(SIDE2_20);
        assertEquals(SIDE2_20, triangle.getSide2());
    }

    @Test
    public void testSetSide3() {
        triangle.setSide3(SIDE3_30);
        assertEquals(SIDE3_30, triangle.getSide3());
    }

    @Test
    public void testDrawTriangle() {
        triangle.setSide1(SIDE1);
        triangle.setSide2(SIDE2);
        triangle.setSide3(SIDE3);
        assertEquals(DRAW_RED, triangle.draw(X,Y));
    }
}
