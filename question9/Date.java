package question9;

import java.util.Scanner;

public class Date {

    int day;
    int month;
    int year;

    void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        day = sc.nextInt();

        System.out.print("Enter month: ");
        month = sc.nextInt();

        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
