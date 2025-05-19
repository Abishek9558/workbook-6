package com.pluralsight.finanace;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        System.out.println(amount);
    }
    public  void withdraw(double amount){
        System.out.println(amount);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
