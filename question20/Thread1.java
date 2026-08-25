package question20;

public class Thread1 extends Thread {

    int n;

    Thread1(int n) {
        this.n = n;
    }

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + (n + i));
        }
    }
}