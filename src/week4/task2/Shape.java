/**
 * class Shape là class ban đầu
 * @author Ngo Thi Hoai Thanh
 */

package week4.task2;
import java.awt.*;
import java.util.Random;

    public class Shape{

    private String color ;
    private boolean filled ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(){
        color = "red";
        filled = true;
    }
    //public void draw(){}

    public Shape(String color, boolean filled){
        this.color= color;
        this.filled= true;
    }

    public String toString(){//ghi de phuong thuc toString()
        /**
         * in ra màn hình màu của hình
         */
        System.out.println(" The Shape is "+getColor());
        return null;
    }
}