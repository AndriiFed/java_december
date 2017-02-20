package com.hillel.lessons.exceptions.atm_new;

public class Person {
  public static void main(String[] args) {
    ATM atm = new ATM();

    final int sum = 800;
    if (atm.hasEnoughMoney(sum)) {
      atm.getMoney(sum);
    }

  }
}
