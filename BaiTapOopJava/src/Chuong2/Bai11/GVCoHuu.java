package Chuong2.Bai11;

public class GVCoHuu extends GiangVien{
private double luongCB;
private double heSoLuong;
private int thamNien;
private double phuCap;

    public GVCoHuu() {
    }

    public GVCoHuu(String hoTen, String daiChi, String loaiGV, double heSoLuong, double luongCB, double phuCap, int thamNien) {
        super(hoTen, daiChi, loaiGV);
        this.heSoLuong = heSoLuong;
        this.luongCB = luongCB;
        this.phuCap = phuCap;
        this.thamNien = thamNien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    @Override
    public double luongThang() {
        if(thamNien<5){luongThang=luongCB*heSoLuong;}
        else {luongThang=luongCB*heSoLuong+luongCB*(thamNien/100f);}
        return luongThang;
    }

    @Override
    public String toString() {
        return "GVCoHuu{" +
                "heSoLuong=" + heSoLuong +
                ", luongCB=" + luongCB +
                ", phuCap=" + phuCap +
                ", thamNien=" + thamNien +
                ", luongThang=" + luongThang +
                '}';
    }
}
