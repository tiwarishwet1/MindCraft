package question11;

public class Employee {

    public int employeeId;
    public String name;
    public double basicSalary;

    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        return basicSalary;
    }
}