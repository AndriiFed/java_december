package com.hillel.lessons.threads.basics;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class TaskCall implements Callable<Integer> {

    public Integer call() throws Exception {
        return IntStream.range(0, 9).sum();
    }
}
