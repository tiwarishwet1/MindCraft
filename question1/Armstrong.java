import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        int original = n1;
        int sum = 0;

        while (n1 > 0) {

            int digit = n1 % 10;

            sum = sum + (digit * digit * digit);

            n1 = n1 / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}