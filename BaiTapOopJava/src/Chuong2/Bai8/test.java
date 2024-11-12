package Chuong2.Bai8;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r1 =new Rectangle();
        Triangle t1 = new Triangle();
        System.out.println("Nhap chieu dai: ");
        r1.legth= scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        r1.width= scanner.nextInt();
        if(r1.legth<r1.width){
            int t= r1.legth;
            r1.legth= r1.width;
            r1.width=t;
        }
        System.out.println("Nhap chieu cao: ");
        t1.height=scanner.nextInt();
        System.out.println("Nhap canh day: ");
        t1.base=scanner.nextInt();

        System.out.println("Sr1= "+r1.getArea());
        System.out.println("St1= "+t1.getArea());
        System.out.println(r1.legth);
        System.out.println(t1.base);
        //Bai9________________________________________________
        System.out.println(r1 instanceof Rectangle );
    }

}
