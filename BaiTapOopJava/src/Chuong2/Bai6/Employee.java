package Chuong2.Bai6;

public class Employee extends Person{
    // khai bao thuoc tinh
    private String employeeName;
    private String dateHired;
    // phuong thuc tao ko doi so
    public Employee() {}
    // phuong thuc tao day du doi so
    public Employee(String name, int age, char gender, String employeeName, String dateHired) {
        super(name, age, gender);
        this.employeeName = employeeName;
        this.dateHired = dateHired;
    }
    // getter and setter
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    //toString

    @Override
    public String toString() {
        return super.toString()+" "+"Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }
}
