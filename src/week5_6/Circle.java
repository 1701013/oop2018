package week5_6;

import java.awt.*;

class Circle extends Shape {
    final double PI;
    double radius;


    public Circle(double _x1, double _y1, double radius) {
        super(_x1, _y1);
        this.PI = Math.PI;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
