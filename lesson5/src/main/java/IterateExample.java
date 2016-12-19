import java.util.stream.IntStream;

public class IterateExample {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i + 3)
                .limit(5)
                .forEach(e -> System.out.println(e));
    }
}
