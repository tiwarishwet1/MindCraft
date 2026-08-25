package question10;

public class Test {
     public static void main(String[] args) {

        WageEmployee w = new WageEmployee(
                1, "Shwet", "30/03/2003", 8, 500);

        SalesPerson s = new SalesPerson(
                2, "Max", "30/09/1997", 8, 500, 20, 100);

        w.display();

        System.out.println();

        s.display();
    }
}
