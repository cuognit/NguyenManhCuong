package Chuong2.Bai1;

public class test {
    public static void main(String[] args) {
        Person ps1 = new Person();
        ps1.setName("Cuong");
        ps1.setDob("12/2/2020");
        ps1.setPob("Ha Noi");
        ps1.setGender('M');
        ps1.setPhone("0987654321");
        ps1.setEmail("abcxyz@gmail.com");
        System.out.println(ps1.getName());
        System.out.println(ps1.getDob());
        System.out.println(ps1.getPob());
        System.out.println(ps1.getGender());
        System.out.println(ps1.getEmail());
        System.out.println(ps1.getPhone());
        System.out.println(ps1.toString());
    }
}
