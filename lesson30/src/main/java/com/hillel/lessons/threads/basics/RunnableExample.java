package com.hillel.lessons.threads.basics;

public class RunnableExample {

    public static void main(String[] args) {

        AnotherTask task = new AnotherTask();
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("In main");
    }
}
