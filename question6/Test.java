package question6;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Max", 75);
        Student s2 = new Student(2, "Shwet", 80);
        Student s3 = new Student(3, "Charles", 85);

        s1.display();
        s2.display();
        s3.display();

        Student.showCount();
    }
}
