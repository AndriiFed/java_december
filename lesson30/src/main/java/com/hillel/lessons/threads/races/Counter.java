package com.hillel.lessons.threads.races;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    //private int count = 0;

    //private Object lock = new Object();
    //private Object lock1 = new Object();

    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        /*
        synchronized (this) {
            count++;
        }
        */
        count.incrementAndGet();
    }

    public void decrement() {
        /*
        synchronized (this) {
            count--;
        }
        */
        count.decrementAndGet();
    }

    public int getValue() {
        return count.intValue();
    }
}
