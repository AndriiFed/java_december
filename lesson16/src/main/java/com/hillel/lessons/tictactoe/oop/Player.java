package com.hillel.lessons.tictactoe.oop;

import java.util.Scanner;

public abstract class Player {
  protected char symbol;
  protected int age;
  protected String name;

  static Scanner scanner = new Scanner(System.in);

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public abstract void makeMove();
}
