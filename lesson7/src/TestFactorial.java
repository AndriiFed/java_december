public class TestFactorial {

    public static void main(String[] args) {
        testFactorial();
        testFactorialNegative();
    }

    private static void testFactorial() {
        int result = Factorial.calculate(5);
        if (result == 120) {
            System.out.println("testFactorial is ok");
        } else {
            System.out.println("testFactorial is wrong");
        }
    }

    private static void testFactorialNegative() {
        int result = Factorial.calculate(-5);
        if (result == 0) {
            System.out.println("testFactorialNeg is ok");
        } else {
            System.out.println("testFactorialNeg is wrong");
        }
    }
}
