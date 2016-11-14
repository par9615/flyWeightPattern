package mx.iteso.Shapes;

import mx.iteso.Shape;

/**
 * Created by simio on 13/11/2016.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(String color){
        this.color = color;
        this.radius = 1;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public String draw(int x, int y) {
        return "Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius;
    }
}
