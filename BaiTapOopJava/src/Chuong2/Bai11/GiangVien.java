package Chuong2.Bai11;

import java.util.Scanner;

public abstract class GiangVien {
    private String hoTen;
    private String daiChi;
    private String loaiGV;
    protected double luongThang;

    public GiangVien() {}

    public GiangVien(String hoTen, String daiChi, String loaiGV) {
        this.hoTen = hoTen;
        this.daiChi = daiChi;
        this.loaiGV = loaiGV;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten: ");
        hoTen=sc.nextLine();
        System.out.println("nhap dia chi: ");
        daiChi=sc.nextLine();
        System.out.println("nhap loai giang vien: ");
        loaiGV=sc.nextLine();

    }
    public void inThongTin(){
        System.out.println("Họ Tên: "+hoTen);
        System.out.println("Địa Chỉ: "+daiChi);
        System.out.println("Loại Giảng Viên: "+loaiGV);
        System.out.println("Lương Tháng: "+luongThang);
    }
    public abstract double luongThang();

    @Override
    public String toString() {
        return "GiangVien{" +
                "hoTen='" + hoTen + '\'' +
                ", daiChi='" + daiChi + '\'' +
                ", loaiGV='" + loaiGV + '\'' +
                ", luongThang=" + luongThang +
                '}';
    }
}
