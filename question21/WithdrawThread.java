package question21;

public class WithdrawThread extends Thread {

    Account account;

    WithdrawThread(Account account) {
        this.account = account;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            account.withdraw(500);
        }
    }
}