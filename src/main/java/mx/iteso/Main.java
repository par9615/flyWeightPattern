package mx.iteso;

/**
 * Created by simio on 09/11/2016.
 */
public class Main {

    public static void main(String[] args){

        Shape circle1 = ShapeFactory.getCircle("Red");


        circle1.setX(10);
        circle1.setY(20);
        
        circle1.draw();

        Shape circle2 = ShapeFactory.getCircle("Red");
        circle2.setX(5);
        circle2.setY(10);
        circle2.draw();

        Shape circle3 = ShapeFactory.getCircle("Green");
        circle3.draw();


    }
}
