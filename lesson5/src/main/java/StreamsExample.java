import java.util.stream.IntStream;

public class StreamsExample {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10)
                .filter(e -> e % 2 == 0)
                .forEach(item -> System.out.println(item));

        boolean test = IntStream.of(1, 3, 8, 9)
                .anyMatch(e -> e % 2 == 0);

        boolean test2 = IntStream.of(1, 3, 8, 9)
                .allMatch(e -> e % 2 == 0);

        boolean test3 = IntStream.of(1, 3, 8, 9)
                .noneMatch(e -> e % 2 == 0);

        System.out.println(test);
    }
}
