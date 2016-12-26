import java.time.Instant;

public class Sample {
    public static void main(String[] args) {
        Instant.now();

        System.out.println("Hello");
        System.out.println(args[0]);
        System.out.println(args[1]);

        System.currentTimeMillis();
    }
}
