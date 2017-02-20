package com.hillel.lessons.exceptions.atm_new;

public class ATM {

  private int totalMoney;

  public ATM() {
    totalMoney = 500;
  }

  public boolean hasEnoughMoney(int money) {
    return totalMoney - money >= 0;
  }

  public void getMoney(int money) {
    if (totalMoney < money) {
      throw new InsufficientFundsException("Not enough money");
    }

    totalMoney = totalMoney - money;

    System.out.println("You've got your money");
  }
}
