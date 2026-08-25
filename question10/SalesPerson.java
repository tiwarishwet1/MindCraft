package question10;

public class SalesPerson extends WageEmployee {

    int items;
    double commission;

    SalesPerson(int id, String name, String dob, int hours, double rate,
                int items, double commission) {

        super(id, name, dob, hours, rate);

        this.items = items;
        this.commission = commission;
    }

    void display() {

        super.display();

        System.out.println("Items Sold: " + items);
        System.out.println("Commission: " + commission);
        System.out.println("Salary: " + calculateSalary());
    }

    double calculateSalary() {
        return hours * rate + items * commission;
    }
}