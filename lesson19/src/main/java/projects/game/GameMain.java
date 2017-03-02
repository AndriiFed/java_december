package projects.game;

import java.util.Arrays;

public class GameMain {

    public static void main(String[] args) {

        GameFactory gameFactory = new GameFactory();

        ConsoleReaderImpl consoleReader = ConsoleReaderImpl.newInstance();

        //Player player1 = new HumanPlayer("John", "Wick", 51, 'X', consoleReader);
        Player player1 = new HumanPlayer.Builder()
            .firstName("John")
            .lastName("Wick")
            .age(51)
            .symbol('X')
            .consoleReader(consoleReader)
            .build();

        Player player2 = new ComputerPlayer('O');

        Game ticTacToe = gameFactory.createGame("tictactoe", player1, player2);
        String winner = ticTacToe.startGame();

        System.out.println(winner);
    }
}
