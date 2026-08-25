package question16_17and18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UtilityList {

    private List<Student> list;

    public UtilityList() {
        list = new ArrayList<>();
    }


    public void createList() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Skills separated by comma: ");
        String skills = sc.nextLine();

        String[] skillArray = skills.split(",");

        Set<String> skillset = new HashSet<>();

        for (String skill : skillArray) {
            skillset.add(skill.trim());
        }

        Student s = new Student(
                rollno,
                name,
                percentage,
                skillset
        );

        list.add(s);
    }


    public void printList() {

        for (Student s : list) {
            System.out.println(s);
        }
    }

    public List<Student> getList() {
        return list;
    }
}