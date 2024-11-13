package Chuong2.Bai10;

public class HocvienLT extends Hocvien{
    private int soBuoi;
    private int donGia;

    public HocvienLT() {
    }

    public HocvienLT(String hoTen, String diaChi, String loaiCT, int loaiUT, int soBuoi, int donGia) {
        super(hoTen, diaChi, loaiCT, loaiUT);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public double hocPhi() {
        if(loaiUT==1){hocPhi=soBuoi*donGia-1000000;}
        else if(loaiUT==2){hocPhi=soBuoi*donGia-800000;}
        else System.out.println("ko co loaiut do");
        return hocPhi;
    }

    @Override
    public String toString() {
        return "HocvienLT{" +
                "donGia=" + donGia +
                ", soBuoi=" + soBuoi +", laoiUT="+loaiUT+", hocPhi="+hocPhi+
                '}';
    }
}
