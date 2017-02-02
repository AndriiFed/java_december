package com.hillel.lessons.tictactoe.oop;

import java.util.Scanner;

import java.util.Random;

public class Game {
  Scanner scanner = new Scanner(System.in);
  Board board;
  Player playerFirst;
  Player playerSecond;
  Player currentPlayer;
  Player winner;

  public Game(Board board) {
    this.board = board;
    playerFirst = new HumanPlayer("Oleg", 19);
    playerSecond = new HumanPlayer("Alexander", 25);
    makeSymbolChoice();
  }

  public void start() {
    playingProcess();
  }

  private void playingProcess() {
    while (!checkEndGame()) {
      makeMove();
      board.printBoard();
      changePlayer();
    }
  }

  private boolean checkEndGame() {
    if (board.checkEndGame()) {
      winner = currentPlayer;
      return true;
    }
    return false;
  }

  private void changePlayer() {
    if (currentPlayer == playerFirst) {
      currentPlayer = playerSecond;
    } else {
      currentPlayer = playerFirst;
    }
  }

  private void makeMove() {
    currentPlayer.makeMove();
  }

  private void makeSymbolChoice() {
    Random random = new Random();
    int choice = random.nextInt(10);
    if (choice >= 5) {
      playerFirst.setSymbol('X');
      playerSecond.setSymbol('O');
      currentPlayer = playerFirst;
    } else {
      playerFirst.setSymbol('O');
      playerSecond.setSymbol('X');
      currentPlayer = playerSecond;
    }
  }


}
