package Chuong2.Bai5;

public class Truong {
    // khai bao thuoc tinh
    private String ten;
    private String diaChi;
    private String hieuTruong;
    // phuong thuc tao ko doi so
    public Truong() {}
    // phuong thuc tao day du doi so
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }
    // getter and setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    //toString
    @Override
    public String toString() {
        return "Truong{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", hieuTruong='" + hieuTruong + '\'' +
                '}';
    }
}
