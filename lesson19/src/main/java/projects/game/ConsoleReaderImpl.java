package projects.game;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsoleReaderImpl {

  Scanner scanner =
      new Scanner(System.in, StandardCharsets.UTF_8.toString());

  private static ConsoleReaderImpl consoleReader;

  public static ConsoleReaderImpl newInstance() {
    if (consoleReader == null) {
      consoleReader = new ConsoleReaderImpl();
    }
    return consoleReader;
  }

  private ConsoleReaderImpl() {
  }

  public String getData() {
    String move = scanner.next();
    return move;
  }
}
