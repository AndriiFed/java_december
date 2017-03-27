package com.hillel.lessons.threads.races;

public class Incrementor implements Runnable {

    private Counter counter;

    public Incrementor(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.increment();
        }
    }
}
