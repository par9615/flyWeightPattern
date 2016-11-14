package mx.iteso;

/**
 * Created by simio on 09/11/2016.
 */
public class Main {

    public static void main(String[] args){

        Circle circle1 = (Circle)ShapeFactory.getCircle("Red");


        circle1.setX(10);
        circle1.setY(20);
        circle1.draw();

        Circle circle2 = (Circle) ShapeFactory.getCircle("Red");
        circle2.draw();

    }
}
