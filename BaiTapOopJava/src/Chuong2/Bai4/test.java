package Chuong2.Bai4;

public class test {
    public static void main(String[] args) {
        BenhVien bv1 =new BenhVien("E","Ha Noi","Cuong");
        BenhNhan bn1 = new BenhNhan();
        bn1.setBenhVien(bv1);
        bn1.setTen("huan");
        bn1.setTuoi(20);
        bn1.setGender('N');
        bn1.setChuanDoan("Benh");
        bn1.setTienSu("dau dau");
        System.out.println(bn1.getTen());
        System.out.println(bn1.getTuoi());
        System.out.println(bn1.getGender());
        System.out.println(bn1.toString());
    }
}
