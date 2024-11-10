package Chuong2.Bai3;

public class test {
    public static void main(String[] args) {
        DiaChi dc1 = new DiaChi("luclieu","hopduc","tanyen","tinh");
        NhanVien nv1 = new NhanVien();
        nv1.setAddress(dc1);
        nv1.setDob("21/2/2020");
        nv1.setGender('M');
        nv1.setName("dinh");
        System.out.println(nv1.toString());

    }
}
