package question10;

public class Employee {
    int id;
    String name;
    String dob;

    Employee(int id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
    }

    double calculateSalary() {
        return 0;
    }
}
