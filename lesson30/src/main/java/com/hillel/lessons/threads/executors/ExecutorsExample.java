package com.hillel.lessons.threads.executors;

import com.hillel.lessons.threads.basics.AnotherTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

    public static void main(String[] args) {

        /*
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new AnotherTask());
        executorService.execute(new AnotherTask());
        executorService.execute(new AnotherTask());
        executorService.execute(new AnotherTask());
        executorService.execute(new AnotherTask());
        executorService.execute(new AnotherTask());
        executorService.execute(new AnotherTask());
        */

        int processors = Runtime.getRuntime().availableProcessors();

        ExecutorService service = Executors.newFixedThreadPool(processors);
        service.execute(new AnotherTask());
        service.execute(new AnotherTask());
        service.execute(new AnotherTask());
        service.execute(new AnotherTask());

        service.shutdown();
    }
}
