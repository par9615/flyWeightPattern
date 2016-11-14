package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Erick on 13/11/2016.
 */
public class CircleTest {
    private static String RED = "Red";
    private static int RADIUS = 1;
    private static int RADIUS_20 = 20;
    private static int X = 10;
    private static int Y = 10;
    private static String DRAW_RED = "Circle: Draw() [Color : " + RED + ", x : " + X + ", y :" + Y + ", radius :" + RADIUS;
    private Circle circle;
    private ShapeFactory shapeFactory;

    @Before
    public void setUp() {
        circle = (Circle) shapeFactory.getCircle(RED);
    }

    @Test
    public void testCircleColorSetUp() {
        assertEquals(RED,circle.color);
    }

    @Test
    public void testCircleRadiusSetUp() {
        assertEquals(RADIUS, circle.getRadius());
    }

    @Test
    public void testDrawCircle() {
        Circle circle1 = (Circle) shapeFactory.getCircle(RED);
        assertEquals(DRAW_RED, circle1.draw(X,Y));
    }

    @Test
    public void testSetRadius() {
        circle.setRadius(RADIUS_20);
        assertEquals(RADIUS_20, circle.getRadius());
    }
}
