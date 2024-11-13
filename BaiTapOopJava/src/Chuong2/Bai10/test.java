package Chuong2.Bai10;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HocvienDH hv1= new HocvienDH();
        HocvienLT hv2=new HocvienLT();
        hv1.nhapThongTin();
        System.out.println("nhap don gia");
        int d= sc.nextInt();
        hv1.setDonGia(d);
        System.out.println("nhap so buoi");
        int s=sc.nextInt();
        hv1.setSoBuoi(s);
        hv2.nhapThongTin();
        System.out.println("nhap don gia");
        int D= sc.nextInt();
        hv2.setDonGia(d);
        System.out.println("nhap so buoi");
        int S=sc.nextInt();
        hv2.setSoBuoi(S);
        hv1.hocPhi();
        hv2.hocPhi();
        System.out.println("thong tin nhu sau");
        hv1.inThongTin();
        System.out.println("");
        hv2.inThongTin();
    }
}
