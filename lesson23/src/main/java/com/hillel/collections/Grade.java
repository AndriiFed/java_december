package com.hillel.collections;

public class Grade {
  private int number;
  private String letter;

  public Grade(int number, String letter) {
    this.number = number;
    this.letter = letter;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getLetter() {
    return letter;
  }

  public void setLetter(String letter) {
    this.letter = letter;
  }
}
