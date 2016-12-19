import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 10)
                .sum();

        System.out.println(sum);
    }
}
