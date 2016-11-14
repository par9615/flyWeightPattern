package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;


/**
 * Created by simio on 13/11/2016.
 */
public class ShapeFactoryTest {
    Shape shape;

    @Before
    public void setUp(){
        shape = Mockito.mock(Shape.class);
        when(shape.draw()).thenReturn("Shape: Draw() [Color : Undefined  ");

    }

    @Test
    public void getCircleTest(){

    }
}
