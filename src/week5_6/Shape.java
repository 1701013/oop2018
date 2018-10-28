package week5_6;
import java.util.Iterator;

public abstract class Shape {
    double x1, y1;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY1() {
        return y1;
    }

    public Shape(double _x1, double _y1) {
        x1 = _x1;
        y1 = _y1;
    }


}