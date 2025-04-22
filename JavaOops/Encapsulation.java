public class BankAccount {
    private double balance;  // private field for encapsulation

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

 class Encapsultion {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance()); // Balance: 1300
    }
}
