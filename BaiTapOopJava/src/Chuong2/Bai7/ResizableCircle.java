package Chuong2.Bai7;

public class ResizableCircle extends Circle implements Resizable{
    int percent;

    public ResizableCircle(){};

    public ResizableCircle(double r) {
        super(r);
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public double resize(int percent) {
        this.percent=percent;
        r = r+r*(percent/100);
        return r;

    }

}
