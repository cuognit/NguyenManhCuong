package Chuong2.Bai8;

public class Rectangle extends Shape {
    protected int legth;
    protected int width;

    public Rectangle() {}

    public Rectangle(String color, int legth, int width) {
        super(color);
        this.legth = legth;
        this.width = width;
    }

    public int getLegth() {
        return legth;
    }

    public void setLegth(int legth) {
        this.legth = legth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
       double s =legth*width;
        return s;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "legth=" + legth +
                ", width=" + width +
                '}';
    }
}
