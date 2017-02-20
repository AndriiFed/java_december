package com.hillel.lessons.exceptions.atm;

public class Person {
  public static void main(String[] args) {
    try (ATM atm = new ATM()) {
      atm.getMoney(300);
      atm.getMoney(200);
      atm.getMoney(100);
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
