package Encapsulation;

public class Bankdemo {
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    public Bankdemo(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is set to 0
    }

    // Getter method for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create a bank account
        Bankdemo account = new Bankdemo("John Doe", 123456789);

        // Deposit and withdraw money
        account.deposit(1000.0);
        account.withdraw(500.0);

        // Display account information
        account.displayAccountInfo();
    }
}
