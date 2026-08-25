package question21;

public class Test {

    public static void main(String[] args) {

        Account account = new Account(5000);

        DepositThread t1 = new DepositThread(account);
        WithdrawThread t2 = new WithdrawThread(account);

        t1.start();
        t2.start();
    }
}