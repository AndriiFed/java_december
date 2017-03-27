package com.hillel.lessons.threads.races;

public class Decrementor implements Runnable {

    private Counter counter;

    public Decrementor(Counter counter) {
        this.counter = counter;
    }


    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.decrement();
        }
    }
}
