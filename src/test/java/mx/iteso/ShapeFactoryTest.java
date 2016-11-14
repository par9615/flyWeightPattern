package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


/**
 * Created by simio on 13/11/2016.
 */
public class ShapeFactoryTest {
    ShapeFactory shapeFactory;

    @Before
    public void setUp(){
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testSameObjectInstance() {
        Shape circle1 = shapeFactory.getCircle("Red");
        Shape circle2 = shapeFactory.getCircle("Red");
        assertTrue(circle1 == circle2);
    }

    @Test
    public void testDifferentColorShape(){
        Shape circle1 = shapeFactory.getCircle("Red");
        Shape circle2 = shapeFactory.getCircle("Green");
        assertFalse(circle1 == circle2);
    }
}
