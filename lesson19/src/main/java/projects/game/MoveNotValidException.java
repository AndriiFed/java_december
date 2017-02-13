package projects.game;

public class MoveNotValidException extends RuntimeException {

  public MoveNotValidException(String message) {
    super(message);
  }
}
