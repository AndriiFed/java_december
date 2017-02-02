package com.hillel.lessons.tictactoe.oop;

public class Main {
  public static void main(String[] args) {
    Board board = new ChessBoard();
    Game game = new Game(board);
    game.start();
  }
}
