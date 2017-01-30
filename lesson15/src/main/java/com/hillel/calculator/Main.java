package com.hillel.calculator;


import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

    BasicOperation[] operations = new BasicOperation[args.length];
    for (int i = 0; i < args.length; i++) {
      Class clazz = Class.forName(args[i]);
      operations[i] = (BasicOperation) clazz.newInstance();
    }

    Arrays.stream(operations)
        .forEach(e -> System.out.println(e.operation(5, 3)));

  }
}
