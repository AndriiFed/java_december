package projects.game;

import java.util.StringJoiner;

public class Board {

    private char[][] array = new char[3][3];

    public Board() {
        fillBoard();
    }

    private void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ' ';
            }
        }
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            StringJoiner joiner = new StringJoiner(",", "[", "]");
            for (int j = 0; j < 3; j++) {
                joiner.add(String.valueOf(array[i][j]));
            }
            System.out.println(joiner.toString());
        }
    }

    public void setMove(int row, int column, char symbol) {
        array[row][column] = symbol;
    }

    public boolean checkHorizontals() {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] &&
                    array[i][1] == array[i][2] &&
                    array[i][0] != ' ') {
                return true;
            }
        }
        return false;
    }

    public boolean checkVerticals() {
        return false;
    }

    public boolean checkDiagonals() {
        return false;
    }

    public boolean allFieldsChecked() {
        return false;
    }

    public char getWinnerSymbol() {
        return 'X';
    }
}
