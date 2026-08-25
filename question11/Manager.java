package question11;

public class Manager extends Employee {

    public double petrolAllowance;
    public double foodAllowance;
    public double otherAllowance;

    public Manager(int employeeId, String name, double basicSalary) {

        super(employeeId, name, basicSalary);

        petrolAllowance = basicSalary * 8 / 100;
        foodAllowance = basicSalary * 12 / 100;
        otherAllowance = basicSalary * 4 / 100;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Petrol Allowance: " + petrolAllowance);
        System.out.println("Food Allowance: " + foodAllowance);
        System.out.println("Other Allowance: " + otherAllowance);
    }
}
