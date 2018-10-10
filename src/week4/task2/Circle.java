/**
 * class Cirle là class con cua class Shape
 * @author Ngo Thi Hoai Thanh
 */
package week4.task2;
import com.sun.corba.se.impl.interceptors.PICurrent;

import java.lang.Math;
class Circle extends Shape {//Circle"IS-A"Shape

    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }



    public double getArea() {
        /** tính diện tích hình tròn
         * trả về diện tích
         */
        return radius * radius*Math.PI;
    }

    public double getPerimeter() {
        /** tính chu vi hình tròn
         * trả về chu vi
         */
        return (2 * radius)*Math.PI ;
    }

    @Override
    public String toString() {
        System.out.println("Dien tich hinh tron: " + getArea());
        System.out.println("Chu vi hinh tron: " + getPerimeter());
        return null;
    }
}