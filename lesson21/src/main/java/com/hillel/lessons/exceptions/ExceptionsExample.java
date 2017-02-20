package com.hillel.lessons.exceptions;

public class ExceptionsExample {
  public static void main(String[] args) {
    int status = getResource();

    if (status == 0) {
      System.out.println("Some actions");
    } else {
      if (status == -1) {
        System.out.println("Network issues");
      } else {
        if (status == -2) {
          System.out.println("File not found");
        }
      }
    }
  }

  public static int getResource() {
    if (networkUnreachable()) {
      return -1;
    }

    if (fileNotFound()) {
      return -2;
    }

    return 0;
  }

  public static boolean networkUnreachable() {
    return true;
  }

  public static boolean fileNotFound() {
    return true;
  }
}
