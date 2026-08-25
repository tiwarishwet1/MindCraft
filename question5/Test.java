package question5;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AccountHolder[] arr = new AccountHolder[10];

        int count = 0;

        while (true) {

            System.out.println("\n1. Add Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter account number: ");
                int accountNo = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter balance: ");
                double balance = sc.nextDouble();

                arr[count] = new AccountHolder(accountNo, name, balance);
                count++;

            } else if (choice == 2) {

                for (int i = 0; i < count; i++) {
                    arr[i].display();
                }

            } else if (choice == 3) {

                System.out.print("Enter account number: ");
                int accountNo = sc.nextInt();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                for (int i = 0; i < count; i++) {

                    if (arr[i].getAccountNo() == accountNo) {
                        arr[i].deposit(amount);
                    }
                }

            } else if (choice == 4) {

                System.out.print("Enter account number: ");
                int accountNo = sc.nextInt();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                for (int i = 0; i < count; i++) {

                    if (arr[i].getAccountNo() == accountNo) {
                        arr[i].withdraw(amount);
                    }
                }

            } else if (choice == 5) {

                break;
            }
        }

        sc.close();
    }
}
