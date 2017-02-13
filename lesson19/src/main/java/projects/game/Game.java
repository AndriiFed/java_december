package projects.game;

public abstract class Game {

  abstract boolean gameFinished();
  abstract void makeMove();
  abstract void changeCurrentPlayer();
  abstract String calculateWinner();
  abstract void printBoard();

  public final String startGame() {
    while (!gameFinished()) {
      makeMove();
      printBoard();
      changeCurrentPlayer();
    }
    return calculateWinner();
  }
}
