package question10;

public class WageEmployee extends Employee {

    int hours;
    double rate;

    WageEmployee(int id, String name, String dob, int hours, double rate) {

        super(id, name, dob);

        this.hours = hours;
        this.rate = rate;
    }

    void display() {

        super.display();

        System.out.println("Hours: " + hours);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + hours * rate);
    }

    double calculateSalary() {
        return hours * rate;
    }
}