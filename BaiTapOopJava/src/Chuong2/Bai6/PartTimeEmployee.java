package Chuong2.Bai6;

public class PartTimeEmployee extends Employee{
    // khai bao thuoc tinh
    private int hoursPerWeek;
    // phuong thuc tao ko doi so
    public PartTimeEmployee() {}
    // phuong thuc tao day du doi so
    public PartTimeEmployee(String name, int age, char gender, String employeeName, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employeeName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }
    // getter and setter

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    //toString
    @Override
    public String toString() {
        return super.toString()+" "+ "PartTimeEmployee{" +
                "hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}
