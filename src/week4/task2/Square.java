/**
 * class Square là class con cua class Rectangle.java
 * @author Ngo Thi Hoai Thanh
 */
package week4.task2;

import java.awt.Shape;

class Square extends Rectangle /*implements Shape*/ {//Square"IS-A"Rectangle
    private double size;

    public Square() {
        double size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color,true );
        this.size = size;
    }

    public Square(String color, boolean filled, double width, double height, double size) {
        super(color, filled, width, height);
        this.size = size;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width=size);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height=size);
    }

    @Override
    public String toString() {
        //System.out.println(toString());
        System.out.println("Dien tich hinh vuong: " + getArea());
        System.out.println("Chu vi hinh vuong: " + getPerimeter());
        return null;
    }
}