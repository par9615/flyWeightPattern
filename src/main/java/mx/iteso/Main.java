package mx.iteso;

/**
 * Created by simio on 09/11/2016.
 */
public class Main {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle1 = shapeFactory.getCircle("Red");
        Shape circle2 = shapeFactory.getCircle("Green");
        Shape triangle1 = shapeFactory.getTriangle("Red");
    }
}
