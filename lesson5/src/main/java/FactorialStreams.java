import java.util.stream.IntStream;

public class FactorialStreams {
    public static void main(String[] args) {
        int fact = IntStream.rangeClosed(1, 5)
                .reduce(1, (x, y) -> x * y);

        System.out.println(fact);
    }
}
