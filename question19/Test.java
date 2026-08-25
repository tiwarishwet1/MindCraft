package question19;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a = new Account(50000);

        System.out.println("Initial Balance: " + a.getBalance());

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        a.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();

        try {

            a.withdraw(withdrawAmount);

        } catch (OverLimit e) {

            System.out.println("OverLimit Exception: "
                    + e.getMessage());

        } catch (InsufficientBalance e) {

            System.out.println("InsufficientBalance Exception: "
                    + e.getMessage());
        }

        sc.close();
    }
}
