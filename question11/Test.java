package question11;

public class Test {

    public static void printObjects(Employee e) {

        e.display();

        System.out.println("Gross Salary: "
                + e.calculateGrossSalary());

        System.out.println("Net Salary: "
                + e.calculateNetSalary());

        System.out.println();
    }

    public static void main(String[] args) {

        Manager m = new Manager(
                101, "Shwet", 30000);

        MarketingExecutive me = new MarketingExecutive(
                102, "Shweta", 20000, 100);

        System.out.println("MANAGER");
        printObjects(m);

        System.out.println("MARKETING EXECUTIVE");
        printObjects(me);
    }
}
