import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysExample {
    public static void main(String[] args) {
        /*
        int[] array = new int[6];
        array[0] = 45;
        array[1] = 25;
        array[2] = -3;
        array[3] = 8;
        array[4] = 10;
        array[5] = 12;
        */

        int[] array = {45, 25, -3, 8, 10, 12};

        //printArray(array);
        streamOutput(array);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void streamOutput(int[] array) {
        IntStream stream = Arrays.stream(array);
        stream.forEach(System.out::println);
    }
}
