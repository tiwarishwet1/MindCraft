package question16_17and18;

import java.util.Set;

public class Student implements Comparable<Student> {

    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int rollno, String name, double percentage, Set<String> skillset) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skillset;
    }

    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public Set<String> getSkillset() {
        return skillset;
    }

    // Setters
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    // Display Student details
    @Override
    public String toString() {
        return "Student [rollno=" + rollno
                + ", name=" + name
                + ", percentage=" + percentage
                + ", skillset=" + skillset + "]";
    }

    // Comparable interface

    @Override
    public int compareTo(Student s) {
        return Double.compare(
                s.getPercentage(),
                this.getPercentage()
        );
    }
}