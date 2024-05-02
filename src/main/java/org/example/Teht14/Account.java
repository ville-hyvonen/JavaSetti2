package org.example.Teht14;

public class Account {
    final String accNum;
    String name;
    double balance;

    public Account(String accNum, String name, double balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public void withdraw(double x) {
        if (balance >= x) {
            balance = balance - x;
            System.out.println("Withdrew: " + x + " - New balance: " + balance);
        } else {
            System.out.println("Current balance: " + balance + " - Balance too low for withdraw.");
        }
    }

    public void deposit(double x) {
        balance = balance + x;
        System.out.println("Deposited: " + x + " New balance: " + balance);
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    protected void accInfo() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Owner: " + name);
        System.out.println("Balance: " + balance);
    }
}
