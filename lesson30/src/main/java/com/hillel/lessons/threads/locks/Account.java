package com.hillel.lessons.threads.locks;

public class Account {

    private int money = 100;

    public int getMoney() {
        return money;
    }

    public void withdraw(int sum) {
        money = money - sum;
    }
}
