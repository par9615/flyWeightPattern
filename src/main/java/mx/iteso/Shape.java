package mx.iteso;

/**
 * Created by simio on 13/11/2016.
 */
public abstract class Shape {
    public String color;
    public int x;
    public int y;
    public abstract void draw();
    public abstract void setX(int x);
    public abstract void setY(int y);

}
