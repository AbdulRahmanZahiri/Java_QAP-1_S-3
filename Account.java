/**
 * QAP 1 - Java Project
 * Author: Abdul Rahman
 * Date: January 2025
 * Description: This class represents a bank account with deposit, withdrawal, and transfer functionalities.
 */

// Account class representing a simple bank account
public class Account {
    private String id;      // Unique identifier for the account
    private String name;    // Account holder's name
    private int balance = 0; // Account balance (default: 0)

    // Constructor to create an account with an ID and name, balance defaults to 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor to create an account with an ID, name, and initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter method to retrieve account ID
    public String getID() {
        return id;
    }

    // Getter method to retrieve account holder's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve current account balance
    public int getBalance() {
        return balance;
    }

    // Adds a specified amount to the balance and returns the updated balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Deducts a specified amount from the balance if sufficient funds are available
    // If not enough balance, it displays an error message
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance: Transaction failed");
        }
        return balance;
    }

    // Transfers a specified amount to another account if sufficient funds are available
    // If not enough balance, it displays an error message
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Insufficient balance: Transfer failed");
        }
        return balance;
    }

    // Returns a formatted string representation of the account details
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
