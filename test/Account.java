public class Account {

    private static double balance = 0;

    public static void setBalance(double amount) {
        balance = amount;
    }

    public static double getBalance() {
        return balance;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }
}