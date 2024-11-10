package Chuong2.Bai5;

public class SinhVien extends Nguoi{
    // khai bao thuoc tinh
    private String lop;
    private String nganh;
    private Truong truong;
    // phuong thuc tao ko doi so
    public SinhVien() {}
    // phuong thuc tao day du doi so
    public SinhVien(String ten, int tuoi, char gender, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gender);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
    // getter and setter
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }
    //toString

    @Override
    public String toString() {
        return "Ten= "+getTen()+ ", Tuoi="+getTuoi()+", GioTinh:"+getGender()+", "+ "SinhVien{" +
                "lop='" + lop + '\'' +
                ", nganh='" + nganh + '\'' +
                ", truong=" + truong +
                '}';
    }
}
