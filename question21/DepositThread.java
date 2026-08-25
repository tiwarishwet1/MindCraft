package question21;

public class DepositThread extends Thread {

    Account account;

    DepositThread(Account account) {
        this.account = account;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            account.deposit(1000);
        }
    }
}