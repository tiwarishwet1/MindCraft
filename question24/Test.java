package question24;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Display All");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter roll no: ");
                int rollno = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter percentage: ");
                double percentage = sc.nextDouble();

                Student s = new Student(rollno, name, percentage);

                dao.insert(s);

            } else if (choice == 2) {

                System.out.print("Enter roll no: ");
                int rollno = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter new name: ");
                String name = sc.nextLine();

                System.out.print("Enter new percentage: ");
                double percentage = sc.nextDouble();

                Student s = new Student(rollno, name, percentage);

                dao.update(s);

            } else if (choice == 3) {

                System.out.print("Enter roll no: ");
                int rollno = sc.nextInt();

                dao.delete(rollno);

            } else if (choice == 4) {

                System.out.print("Enter roll no: ");
                int rollno = sc.nextInt();

                dao.display(rollno);

            } else if (choice == 5) {

                dao.displayAll();

            } else if (choice == 6) {

                break;
            }
        }

        sc.close();
    }
}