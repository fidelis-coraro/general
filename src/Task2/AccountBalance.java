package Task2;
import java.util.Scanner;

class Account {
    private double balance;

    // Default constructor with no arguments
    public Account() {
        this.balance = 0.0;
    }

    // Parameterized constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: Rs" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount should be greater than 0.");
        }
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: Rs" + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Amount should be greater than 0 and less than or equal to the balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: Rs" + balance);
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an account using the default constructor
        Account account1 = new Account();

        // Create another account using the parameterized constructor
        System.out.print("Enter initial balance for the second account: Rs");
        double initialBalance = scanner.nextDouble();
        Account account2 = new Account(initialBalance);

        // Perform operations on the first account
        account1.deposit(100.0);
        account1.withdraw(50.0);
        account1.displayBalance();

        // Perform operations on the second account
        account2.deposit(200.0);
        account2.withdraw(150.0);
        account2.displayBalance();


    }
}

