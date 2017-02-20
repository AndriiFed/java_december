package com.hillel.lessons.exceptions.atm;

public class ATM implements AutoCloseable {

  private int totalMoney;

  public ATM() {
    totalMoney = 500;
  }

  public void getMoney(int money) throws InsufficientFundsException {
    if (totalMoney < money) {
      throw new InsufficientFundsException("Not enough money");
    }

    totalMoney = totalMoney - money;
  }

  @Override
  public void close() throws Exception {
    System.out.println("Closing ATM");
  }
}
