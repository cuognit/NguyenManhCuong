package Chuong2.Bai11;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GVCoHuu gv1 =new GVCoHuu();
        GVThinhGiang gv2 =new GVThinhGiang();
        gv1.nhapThongTin();
        System.out.println("nhập hệ số lương: ");
        double hsl=sc.nextDouble();
        gv1.setHeSoLuong(hsl);
        System.out.println("nhập lương cơ bản: ");
        double lcb = sc.nextDouble();
        gv1.setLuongCB(lcb);
        System.out.println("nhập thâm niên: ");
        int tn = sc.nextInt();
        gv1.setThamNien(tn);
        gv1.luongThang();

        gv2.nhapThongTin();
        System.out.println("nhập đơn giá: ");
        double dg = sc.nextDouble();
        gv2.setDonGia(dg);
        System.out.println("nhap so tiet day: ");
        int st =sc .nextInt();
        gv2.setSoTietDay(st);
        gv2.luongThang();
        System.out.println("thông tin gv1");
        gv1.inThongTin();
        System.out.println("thông tin gv2");
        gv2.inThongTin();




    }
}
