package com.hillel.lessons.threads.basics;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Task task = new Task();
        task.setName("Counter");
        task.setPriority(Thread.MIN_PRIORITY);
        task.start();

        task.interrupt();

        //task.join();

        for (int i = 0; i < 10; i++) {
            Thread.yield();
            Thread.sleep(1);
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

}
