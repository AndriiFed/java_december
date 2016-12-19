public class LoopsExample {
    public static void main(String[] args) {

        boolean test = false;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                test = true;
                break;
            }
        }

        System.out.println(test);
    }
}
