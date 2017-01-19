public class StringTest {
  public static void main(String[] args) {
    String str = "101111000101";
    //int number = 101111000101;

    int result = 0;
    int power = str.length() - 1;
    for (int i = 0; i < str.length(); i++) {
      char symbol = str.charAt(i);
      int digit = Character.getNumericValue(symbol);
      result = result + (int)Math.pow(2, power) * digit;
      power--;
    }
    System.out.println(result);
  }
}
