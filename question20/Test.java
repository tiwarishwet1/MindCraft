package question20;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Thread1 t1 = new Thread1(n);
        Thread2 t2 = new Thread2(n);

        t1.start();
        t2.start();

        sc.close();
    }
}