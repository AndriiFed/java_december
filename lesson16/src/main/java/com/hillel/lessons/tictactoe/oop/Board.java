package com.hillel.lessons.tictactoe.oop;

/**
 * Created by User on 02.02.2017.
 */
public interface Board {
  void fillCell(int row, int column, char symbol);

  boolean checkEndGame();

  void printBoard();

}
