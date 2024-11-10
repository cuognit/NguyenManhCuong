package Chuong2.Bai4;

public class BenhVien {
    // khai bao thuoc tinh
    private String ten;
    private String diaChi;
    private String giamDoc;
    // phuong thuc tao ko doi so
    public BenhVien() {}
    // phuong thuc tao day du doi so
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
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

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }
    //toString
    @Override
    public String toString() {
        return "BenhVien{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", giamDoc='" + giamDoc + '\'' +
                '}';
    }
}
