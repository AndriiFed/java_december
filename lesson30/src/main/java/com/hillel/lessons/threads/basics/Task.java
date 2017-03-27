package com.hillel.lessons.threads.basics;

public class Task extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 5 && Thread.currentThread().isInterrupted()) {
                break;
            }
            /*
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
