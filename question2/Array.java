package question2;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < 5; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr2[i] = arr[i] * 5;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        System.out.println("New Array:");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}