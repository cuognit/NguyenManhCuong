package Chuong2.Bai7;

public class test {
    public static void main(String[] args) {
        ResizableCircle re =new ResizableCircle();
        System.out.println(re.r);
        System.out.println("cvi= "+  re.getPerimeter(re.r));
        System.out.println("S= "+ re.getArea(re.r));
        System.out.println(re.resize(200));
        System.out.println(re.r);
        System.out.println("recvi= "+  re.getPerimeter(re.r));
        System.out.println("reS= "+ re.getArea(re.r));
        System.out.println(re.getPercent());

    }
}
