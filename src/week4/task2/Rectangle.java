/**
 * class Rectangle là class con cua class Shape
 * @author Ngo Thi Hoai Thanh
 */
package week4.task2;
class Rectangle extends Shape{//Rectangle"Is-A"Shape
    private double width;
    private double height;
    public Rectangle(){
        width = 1.0;
        height=1.0;
    }
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        /** hàm tính dienj tích hình chữ nhật;
         * trả về diện tích;
         */
        return width *height;
    }

    public double getPerimeter() {
        /** hàm tính chu vi
         * trả về chu vi
         */
        return 2*(height +width);
    }

    @Override
    public String toString() {
        System.out.println("Dien tich hinh chu nhat: " + getArea());
        System.out.println("Chu vi hinh chu nhat: " + getPerimeter());
        return null;
    }
}