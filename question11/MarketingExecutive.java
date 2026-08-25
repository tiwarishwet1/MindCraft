package question11;
public class MarketingExecutive extends Employee {

    public double kilometersTravelled;
    public double tourAllowance;
    public double telephoneAllowance;

    public MarketingExecutive(int employeeId, String name,
                              double basicSalary, double kilometersTravelled) {

        super(employeeId, name, basicSalary);

        this.kilometersTravelled = kilometersTravelled;
        tourAllowance = kilometersTravelled * 5;
        telephoneAllowance = 2000;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Tour Allowance: " + tourAllowance);
        System.out.println("Telephone Allowance: " + telephoneAllowance);
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + tourAllowance + telephoneAllowance;
    }

    @Override
    public double calculateNetSalary() {

        double pf = basicSalary * 12.5 / 100;

        return calculateGrossSalary() - pf;
    }
}
