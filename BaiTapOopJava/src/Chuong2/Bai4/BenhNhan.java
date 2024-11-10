package Chuong2.Bai4;

public class BenhNhan extends Nguoi {
    // khai bao thuoc tinh
    private String tienSu;
    private String chuanDoan;
    private BenhVien benhVien;
    // phuong thuc tao ko doi so
    public BenhNhan() {}
    //phuong thuc tao day du doi so
    public BenhNhan(String ten, int tuoi, char gender, String tienSu, String chuanDoan, BenhVien benhVien) {
        super(ten, tuoi, gender);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }
    // getter and setter

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    //toString

    @Override
    public String toString() {
        return "BenhNhan{" +
                "tienSu='" + tienSu + '\'' +
                ", chuanDoan='" + chuanDoan + '\'' +
                ", benhVien=" + benhVien +
                '}';
    }
}
