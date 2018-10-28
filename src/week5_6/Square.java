package week5_6;

class Square extends Shape {
    private double side;

    public Square(double _x1, double _y1, double side) {
        super(_x1, _y1);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
