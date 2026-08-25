package question3;

public class Matrix {

    int[][] a = new int[3][3];

    void display() {

        for (int[] row : a) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    void transpose() {

        System.out.println("Transpose:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    Matrix add(Matrix b) {

        Matrix c = new Matrix();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c.a[i][j] = a[i][j] + b.a[i][j];
            }
        }

        return c;
    }
}