class BankAccount {
    private int balance;

    void setBalance(int b) {
        if (b >= 0) {
            balance = b;
        } else {
            System.out.println("Invalid balance");
        }
    }

    int getBalance() {
        return balance;
    }
}

public class Practical10 {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setBalance(5000);

        System.out.println("Account Balance: " + b.getBalance());

        b.setBalance(-100);
    }
}
