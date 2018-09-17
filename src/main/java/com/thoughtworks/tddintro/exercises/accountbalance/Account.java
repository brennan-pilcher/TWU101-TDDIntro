package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account (int startingBalance) {
        balance = startingBalance;
    }

    public void deposit (int value) {
        balance += value;
    }

    public void withdraw (int value) {
        balance -= value;
    }

    public int balance() {
        return balance;
    }
}
