public class Overloading {
    public static void main(String[] args) {
        long a = 5;
        int b = 10;

        long res = sum(a, b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }
}
