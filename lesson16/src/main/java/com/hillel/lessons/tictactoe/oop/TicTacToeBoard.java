package com.hillel.lessons.tictactoe.oop;

import java.util.Arrays;

public class TicTacToeBoard implements Board {
  private Character[][] field;

  public TicTacToeBoard() {
    field = new Character[3][3];
  }

  public void printBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (field[i][j] != null) {
          System.out.print(field[i][j]);
        }
        System.out.print( " | ");
      }
      System.out.println();
    }
  }


  @Override
  public void fillCell(int row, int column, char symbol) {
    field[row][column] = symbol;
  }

  @Override
  public boolean checkEndGame() {
    //// TODO: 02.02.2017
    return false;
  }


}
