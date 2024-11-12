package Chuong2.Bai7;

public class Circle implements GeometricObject{
    double r = 1.0 ;

    public Circle() {}

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter(double r) {
        double C = r*2*Math.PI;
        return C;
    }

    @Override
    public double getArea(double r) {
        double S = r*r*Math.PI;
        return S;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
