package question15;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n----- Employee Menu -----");
            System.out.println("1. Insert Employee Record :");
            System.out.println("2. Update Employee Information:");
            System.out.println("3. Display All Employees Records:");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                Employee e = new Employee();
                e.accept();
                employees.add(e);
                System.out.println("Employee inserted successfully.");

                break;

            case 2:

                System.out.print("Enter Employee ID to update: ");
                int id = sc.nextInt();

                for (Employee emp : employees) {

                    if (emp.eid == id) {
                    	
                        sc.nextLine();

                        System.out.print("Enter new Employee Name: ");
                        emp.ename = sc.nextLine();

                        System.out.print("Enter new Salary: ");
                        emp.salary = sc.nextDouble();

                        System.out.println("Employee updated successfully.");

                        break;
                    }
                }

                break;

            case 3:
                if (employees.isEmpty()) {

                    System.out.println("No employee records available.");
                } else {
                    System.out.println("\n----- Employee Records -----");
                    
                    for (Employee emp : employees) {

                        emp.display();

                        System.out.println("--------------------");
                    }
                }
                break;

            case 4:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}