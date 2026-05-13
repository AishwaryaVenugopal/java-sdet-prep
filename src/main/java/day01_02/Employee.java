package day01_02;

public class Employee {
    private String name;
    public double testSalary;
    private int ID;
    private double salary;

    public void displayDetails() {
        System.out.println("Name: " +name);
        System.out.println("ID: " +ID);
        System.out.println("Salary: " +salary);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setID (int ID) {
        this.ID = ID;
    }
    public int getID () {
        return ID;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
