package Chuong2.Bai5;

public class Nguoi {
    // khai bao thuoc tinh
    private String ten;
    private int tuoi;
    private char gender;
    // phuong thuc tao ko doi so
    public Nguoi() {}
    // phuong thuc tao day du doi so
    public Nguoi(String ten, int tuoi, char gender) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gender = gender;
    }
    //getter and setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    //toString
    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gender=" + gender +
                '}';
    }
}
