package week5_6;
import java.awt.*;
import java.util.*;
import java.awt.Color;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.WritableRaster;
import java.awt.Window;

import java.io.File;
import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import com.sun.org.apache.bcel.internal.generic.LADD;
import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;

public class Diagram extends Layer {

    void update(){
        // main animation loop
        while (true)  {

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update position
            rx = rx + vx;
            ry = ry + vy;

            if (Math.abs(rx1 + vx1) > 1.0 - dw) vx1 = -vx1;
            if (Math.abs(ry1 + vy1) > 1.0 - dh) vy1 = -vy1;
            rx1 = rx1 + vx1;
            ry1 = ry1 + vy1;
            // clear the background
            StdDraw.clear(StdDraw.LIGHT_GRAY);

            // draw ball on the screen
            StdDraw.setPenColor(cl);//tô màu bóng ngẫu nhiên
            StdDraw.filledCircle(rx, ry, radius);// vẽ bongs
            StdDraw.setPenColor(cl);//tô màu bóng ngẫu nhiên
            StdDraw.filledRectangle(rx1,ry1,dh,dw);
            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(20);

        }
    }

    public Diagram() {

    }

    public void run(){
        for (int i=0; i<9; i++) {
            Diagram l = new Diagram();
            l.bongnay();// ti le canvas
            l.update();
        }
    }

        ArrayList<Layer> listLayer;
        public Diagram(ArrayList<Layer> layers) {
            listLayer=layers;
        }
        public void removeCircle() {
            for(Layer layer: listLayer) {
                layer.removeCicle();
            }

        }
        public static void main(String args[]) {new Diagram().run();
            ArrayList<Shape> list = new ArrayList<>();
            list.add(new Circle(10,20,30));
            list.add(new Rectangle(10,20,30,40));
            ArrayList<Shape> list1 = new ArrayList<>();
            list.add(new Circle(30,20,30));
            list.add(new Rectangle(50,80,30,40));

            Layer b= new Layer(list);
            Layer c= new Layer(list1);
            ArrayList<Layer> list3= new ArrayList<>();
            list3.add(b);
            list3.add(c);

            week5_6.Diagram a= new week5_6.Diagram(list3);
            for(Layer layer:list3) {
                for(Shape shape: layer.listShape) {
                    System.out.println(shape);
                }
            }
            a.removeCircle();
            System.out.println("then"+"\n");
            for(Layer layer:list3) {
                for(Shape shape: layer.listShape) {
                    System.out.println(shape);
                }
            }
        }
    }






