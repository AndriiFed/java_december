import java.util.Arrays;

public class TwoDimArrays {
    public static void main(String[] args) {
        int[][] array = new int[5][];

        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[1];
        array[3] = null;
        array[4] = new int[5];

        array[0][0] = 2;
        array[0][1] = 5;
        array[1][1] = 8;
        array[1][0] = 0;
        array[1][2] = -5;
        array[2][0] = 9;

        String resultOne = Arrays.toString(array[0]);
        System.out.println(resultOne);

        System.out.println();

        String result = Arrays.deepToString(array);
        System.out.println(result);
    }
}
