package week5_6;

class Triangle extends Shape {
    double edge1, edge2, edge3;

    public Triangle(double _x1, double _y1, double edge1, double edge2, double edge3) {
        super(_x1, _y1);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;


    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public double getEdge1() {
        return edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edge1=" + edge1 +
                ", edge2=" + edge2 +
                ", edge3=" + edge3 +
                '}';
    }
}
