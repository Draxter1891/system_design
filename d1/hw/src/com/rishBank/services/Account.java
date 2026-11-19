package hw.src.com.rishBank.services;

import hw.src.com.rishBank.enums.AccountType;

public class Account {
    private static int counter = 10239487;
    public final int acNumber;
    private double balance;
    AccountType type;
    private String name;

    public Account(String name, AccountType type, double balance) {
        if (balance < 2000) {
            throw new IllegalArgumentException("Account opening balance should be greater than or equal to Rs. 2000/-");
        }
        this.name = name;
        counter++;
        acNumber = counter;
        this.balance = balance;
        this.type = type;
    }

    public void getAccountInfo() {
        System.out.println("*********************************************");
        System.out.println("Welcome to RISH BANK");
        System.out.println(this.type + " Account");
        System.out.println("Account Number: " + this.acNumber);
        System.out.println("Account holder's name: " + this.name);
        System.out.println("Balance: " + getBalance());
        System.out.println("*********************************************");
    }

    private double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount should be greater than 0 ");
        }
        this.balance += amount;
        System.out.println(amount + " deposited successfully ");
    }

    public void withdraw(double amount) {
        if (this.balance == 0) {
            throw new IllegalArgumentException("Low balance ");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount! ");

        }

        if(amount>this.balance){
             throw new IllegalArgumentException("Low balance");

        }

        this.balance -= amount;
        System.out.println(amount + " withdrawn successfully ");
    }

}
