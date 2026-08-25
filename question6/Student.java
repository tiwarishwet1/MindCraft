package question6;

public class Student {
    int rollno;
    String name;
    double percentage;

    static int count = 0;

    Student(int rollno, String name, double percentage) {

        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;

        count++;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + percentage);
    }

    static void showCount() {
        System.out.println("Number of objects: " + count);
    }
}
