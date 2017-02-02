package com.hillel.lessons.tictactoe.procedural;

import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char[][] board = new char[3][3];
    fillBoard(board);

    char currentPlayer = 'X';
    while (!gameFinished(board)) {
      System.out.print("Make your move: ");
      String move = scanner.next();
      int row = Character.getNumericValue(move.charAt(0));
      int column = Character.getNumericValue(move.charAt(1));
      board[row][column] = currentPlayer;

      /*
      if (currentPlayer == 'X') {
        currentPlayer = 'O';
      } else {
        currentPlayer = 'X';
      }
      */

      currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

      printBoard(board);
    }

    char winner = findWinner(board);
  }

  private static char findWinner(char[][] board) {
    return 0;
  }

  private static void printBoard(char[][] board) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
    }
  }

  private static boolean gameFinished(char[][] board) {
    return false;
  }

  private static void fillBoard(char[][] board) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }
  }
}
