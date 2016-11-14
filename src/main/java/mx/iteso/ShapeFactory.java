package mx.iteso;

/**
 * Created by simio on 13/11/2016.
 */
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();
    private static final HashMap<String, Shape> triangleMap = new HashMap();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }

    public static Shape getTriangle(String color) {
        Shape triangle = triangleMap.get(color);

        if(triangle == null) {
            triangle = new Triangle(color);
            triangleMap.put(color, triangle);
            System.out.println("Creating triangle of color: " + color);
        }

        return triangle;
    }
}