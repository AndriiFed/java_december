package com.hillel.lessons.threads.executors;

import com.hillel.lessons.threads.basics.TaskCall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<Integer> result = service.submit(new TaskCall());

        //some actions

        int sum = result.get();

        service.shutdown();

        System.out.println(sum);

        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

        ConcurrentMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    }
}
