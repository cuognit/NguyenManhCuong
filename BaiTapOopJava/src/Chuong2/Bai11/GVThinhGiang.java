package Chuong2.Bai11;

public class GVThinhGiang extends GiangVien{
    private int soTietDay;
    private double DonGia;
    private double thuNhap;

    public GVThinhGiang() {
    }

    public GVThinhGiang(String hoTen, String daiChi, String loaiGV, double donGia, int soTietDay, double thuNhap) {
        super(hoTen, daiChi, loaiGV);
        DonGia = donGia;
        this.soTietDay = soTietDay;
        this.thuNhap = thuNhap;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    @Override
    public double luongThang() {
        luongThang=soTietDay*DonGia-0.15*(soTietDay*DonGia);
        return luongThang;
    }

    @Override
    public String toString() {
        return "GVThinhGiang{" +
                "DonGia=" + DonGia +
                ", soTietDay=" + soTietDay +
                ", thuNhap=" + thuNhap +
                ", luongThang=" + luongThang +
                '}';
    }
}
