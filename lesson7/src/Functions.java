public class Functions {
    public static void main(String[] args) {
        func1();
    }

    public static void func1() {
        int i = 5;
        System.out.println("Before call to 2");
        func2();
        System.out.println("After call to 2");
    }

    public static void func2() {
        int i = 5;
        System.out.println("asdfdsaf");
        func3();
    }

    public static void func3() {
        int i = 5;
        System.out.println("asdfdsaf");
    }
}
