package mx.iteso.Shapes;

import mx.iteso.Shape;

/**
 * Created by Erick on 13/11/2016.
 */
public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(String color) {
        this.color = color;
        this.side1 = 1;
        this.side2 = 2;
        this.side3 = 3;
    }

    public void setSide1(int side) {
        this.side1 = side;
    }

    public void setSide2(int side) {
        this.side2 = side;
    }

    public void setSide3(int side) {
        this.side3 = side;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String draw(int x, int y) {
        return "Triangle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", side1 :" + side1 + ", side2 :" + side2 + ", side3 :" + side3;
    }
}
