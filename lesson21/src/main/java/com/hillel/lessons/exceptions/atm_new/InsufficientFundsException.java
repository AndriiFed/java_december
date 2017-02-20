package com.hillel.lessons.exceptions.atm_new;

public class InsufficientFundsException extends RuntimeException {

  public InsufficientFundsException(String message) {
    super(message);
  }
}
