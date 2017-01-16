package com.hillel.lesson11;

public class FunctionsTest {
  public static void main(String[] args) {
    FunctionsTest functionsTest = new FunctionsTest();
    functionsTest.function(0);
  }

  public void function(int cnt) {
    if (cnt == 5) {
      return;
    }

    System.out.println(cnt);
    cnt++;
    function(cnt);
  }

  /*
  public void function2() {
    System.out.println("function2");
    function3();
  }

  public void function3() {
    System.out.println("function3");
  }
  */
}
