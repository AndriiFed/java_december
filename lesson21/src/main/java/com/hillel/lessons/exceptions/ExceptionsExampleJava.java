package com.hillel.lessons.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsExampleJava {
  public static void main(String[] args) {
    try {
      getResource();
    } catch (NetworkUnreachableException
        | FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("finally is always executed");
    }

    System.out.println("after try-catch");
  }

  public static void getResource()
      throws NetworkUnreachableException, FileNotFoundException {

    if (networkUnreachable()) {
      throw new NetworkUnreachableException("Network is unreachable");
    }

    if (fileNotFound()) {
      throw new FileNotFoundException("File not found");
    }

    if (somethingHappened()) {
      throw new RuntimeException("Something happened");
    }
  }

  private static boolean somethingHappened() {
    return true;
  }

  public static boolean networkUnreachable() {
    return false;
  }

  public static boolean fileNotFound() {
    return false;
  }
}
