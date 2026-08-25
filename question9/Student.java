package question9;

import java.util.Scanner;

public class Student {

    int rollNo;
    String name;
    Date dob;

    static int count = 0;

    Student() {
        count++;
        rollNo = count;
        dob = new Date();
    }

    Student(String name, Date dob) {
        count++;
        rollNo = count;
        this.name = name;
        this.dob = dob;
    }

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter date of birth:");
        dob.accept();
    }

    void display() {

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.print("Date of Birth: ");
        dob.display();
    }
}

