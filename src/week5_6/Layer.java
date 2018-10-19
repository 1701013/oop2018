package week5_6;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Layer  {
    ArrayList <Shape> listShape;
    Layer() {
        listShape= new ArrayList<>();
    };
    Layer(ArrayList<Shape> shapes) {
        listShape=shapes;
    }
    // initial values
    Random m = new Random();
    Color cl = new Color(m.nextInt(255), m.nextInt(255), m.nextInt(255));
    public double rx = (Math.random() * (0.02)) + 0.48, ry = (Math.random() * (0.02)) + 0.86;     // position
    public double vx = (Math.random() * (0.02)) + 0.015, vy = (Math.random() * (0.02)) + 0.023;     // velocity
    public double radius = (Math.random() * (0.05)) + 0.05;              // radius

    public double rx1 = (Math.random() * (0.02)) + 0.48, ry1 = (Math.random() * (0.02)) + 0.86;     // vị trí
    public double vx1 = (Math.random() * (0.02)) + 0.015, vy1 = (Math.random() * (0.02)) + 0.023;     // vận tốc
    public double dh = (Math.random() * (0.3)) + 0.015, dw = (Math.random() * (0.2)) + 0.023;     // nửa chiều dài, nửa chiều rộng


    void bongnay() {

        // cài đtặ tỉ lệ giao diện
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        // StdDraw.enableDoubleBuffering();
    }

    public void removeCicle() {
        Iterator<Shape> iter= listShape.iterator();
        while (((Iterator) iter).hasNext()) {
            Shape item= (Shape) ((Iterator) iter).next();
            if(item instanceof Circle) {
                ((Iterator) iter).remove();
            }
        }
    }
    public void removeTriangle() {
        Iterator<Shape> iter= listShape.iterator();
        while (((Iterator) iter).hasNext()) {
            Shape item=(iter).next();
            if(item instanceof Triangle) {
                ((Iterator) iter).remove();
            }
        }
    }

}

