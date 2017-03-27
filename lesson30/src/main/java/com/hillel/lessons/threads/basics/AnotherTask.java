package com.hillel.lessons.threads.basics;

public class AnotherTask implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
