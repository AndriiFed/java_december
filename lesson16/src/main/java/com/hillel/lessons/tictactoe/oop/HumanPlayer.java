package com.hillel.lessons.tictactoe.oop;

public class HumanPlayer extends Player {

  public HumanPlayer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void makeMove() {
    //System.out.print("Make your move " + currentPlayer.getName() + ": ");
    String move = scanner.next();
    int row = Character.getNumericValue(move.charAt(0));
    int column = Character.getNumericValue(move.charAt(1));
    //board.fillCell(row, column, currentPlayer.getSymbol());
  }
}
