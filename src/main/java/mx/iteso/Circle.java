package mx.iteso;

/**
 * Created by simio on 13/11/2016.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(String color){
        this.color = color;
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
