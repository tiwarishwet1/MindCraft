package question15;

import java.util.Scanner;

public class Employee {

    int eid;
    String ename;
    double salary;

    public Employee() {
        eid = 0;
        ename = "";
        salary = 0.0;
    }

    public Employee(int eid, String ename, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        eid = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void display() {

        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Salary: " + salary);
    }
}
