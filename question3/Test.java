package question3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        System.out.println("Enter first matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1.a[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix:");
        m1.display();

        m1.transpose();

        System.out.println("Enter second matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2.a[i][j] = sc.nextInt();
            }
        }

        Matrix result = m1.add(m2);

        System.out.println("Addition:");
        result.display();

        sc.close();
    }
}