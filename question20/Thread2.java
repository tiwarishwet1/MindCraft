package question20;

public class Thread2 extends Thread {

    int n;

    Thread2(int n) {
        this.n = n;
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 2: " + n + " x " + i + " = " + (n * i));
        }
    }
}