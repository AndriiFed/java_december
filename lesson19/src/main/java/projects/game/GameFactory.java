package projects.game;

public class GameFactory {

  public Game createGame(String game, Player player1, Player player2) {
    switch (game) {
      case "tictactoe":
        return new TicTacToe(player1, player2);
      case "chess":
        return new Chess();
      default:
        throw new NoSuchGameException("There is no such a game");
    }
  }
}
