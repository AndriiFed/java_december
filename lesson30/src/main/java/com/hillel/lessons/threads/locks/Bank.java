package com.hillel.lessons.threads.locks;

public class Bank implements Runnable {

    CustomLock customLock = new CustomLock();
    static Account account = new Account();


    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank();

        Thread john = new Thread(bank);
        Thread anna = new Thread(bank);

        john.start();
        anna.start();

        john.join();
        anna.join();

        System.out.println(account.getMoney());
    }


    public void run() {
        customLock.lock();

        if (account.getMoney() >= 100) {
            account.withdraw(100);
        }

        customLock.unlock();
    }
}
