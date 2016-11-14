package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by simio on 13/11/2016.
 */
public class ShapeFactoryTest {
    private static String COLOR_1 = "Red";
    private static String COLOR_2 = "Green";
    ShapeFactory shapeFactory;

    @Before
    public void setUp(){
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testSameCircleInstance() {
        Shape circle1 = shapeFactory.getCircle(COLOR_1);
        Shape circle2 = shapeFactory.getCircle(COLOR_1);
        assertTrue(circle1 == circle2);
    }

    @Test
    public void testSameTriangleInstance() {
        Shape triangle1 = shapeFactory.getTriangle(COLOR_1);
        Shape triangle2 = shapeFactory.getTriangle(COLOR_1);
        assertTrue(triangle1 == triangle2);
    }

    @Test
    public void testDifferentTriangleColor() {
        Shape triangle1 = shapeFactory.getTriangle(COLOR_1);
        Shape triangle2 = shapeFactory.getTriangle(COLOR_2);
        assertFalse(triangle1 == triangle2);
    }

    @Test
    public void testDifferentCircleColor(){
        Shape circle1 = shapeFactory.getCircle(COLOR_1);
        Shape circle2 = shapeFactory.getCircle(COLOR_2);
        assertFalse(circle1 == circle2);
    }
}
