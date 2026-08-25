package question7;

public class Test {
     public static void main(String[] args) {

        Student s1 = new Student(1, "Max", 75);

        System.out.println(s1);

        s1.setName("Charles");
        s1.setPercentage(85);

        System.out.println(s1);

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
        System.out.println(s1.getPercentage());
    }
}
