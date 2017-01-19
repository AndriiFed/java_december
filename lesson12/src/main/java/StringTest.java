public class StringTest {
  public static void main(String[] args) {
    boolean a, b, c;
    a = b = c = false;
    func();
    boolean bool = (a = true) || (b = true) && (c = true);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  public static void func() {
    System.out.println("hello");
  }
}
