class Account {
    int balance = 1000;

    void withdraw(int amt) {
        synchronized(this) {
            balance -= amt;
            System.out.println("Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account a = new Account();

        new Thread(() -> a.withdraw(200)).start();
        new Thread(() -> a.withdraw(300)).start();
    }
}