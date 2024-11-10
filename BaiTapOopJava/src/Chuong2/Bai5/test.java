package Chuong2.Bai5;

public class test {
    public static void main(String[] args) {
        Truong tr = new Truong("Haui","Ha Noi","Cuong");
        SinhVien sv1 = new SinhVien();
        sv1.setTen("cuong");
        sv1.setTuoi(19);
        sv1.setGender('M');
        sv1.setLop("IT7");
        sv1.setNganh("IT");
        sv1.setTruong(tr);
        System.out.println(sv1.toString());
    }

}
