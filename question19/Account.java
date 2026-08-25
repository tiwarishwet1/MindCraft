package question19;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    
    public void withdraw(double amount)
            throws OverLimit, InsufficientBalance {

        if (amount > 15000) {
            throw new OverLimit(
                    "Withdrawal limit is Rs.15000 per transaction"
            );
        }

        if (amount > balance) {
            throw new InsufficientBalance(
                    "Insufficient balance"
            );
        }

        balance = balance - amount;

        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
