package Chuong2.Bai10;

import java.util.Scanner;

public abstract class Hocvien {
    private String hoTen;
    private String diaChi;
    private String loaiCT;
    protected int loaiUT;
    protected int hocPhi;
    public Hocvien() {}

    public Hocvien(String hoTen, String diaChi, String loaiCT, int loaiUT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCT = loaiCT;
        this.loaiUT = loaiUT;
    }

    public void nhapThongTin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.print("nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.print("nhap loai ct dky: ");
        loaiCT=sc.nextLine();
        System.out.print("nhap loai ut: ");
        loaiUT=sc.nextInt();
    }
    public abstract double hocPhi();
    public void inThongTin(){
        System.out.println("ho ten: "+hoTen);
        System.out.println("dia chi: "+diaChi);
        System.out.println("loai CT: "+loaiCT);
        System.out.println("loai UT: "+loaiUT);
        System.out.println("hoc phi: "+hocPhi);
    }

}
