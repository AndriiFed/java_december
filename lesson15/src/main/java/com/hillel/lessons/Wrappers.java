package com.hillel.lessons;

import java.math.BigInteger;

public class Wrappers {

  public static void main(String[] args) {
    int number = 5;

    //Integer numInteger = new Integer(5);
    Integer numInteger = Integer.valueOf(5);

    //Integer.MAX_VALUE;

    //BigInteger num = new BigInteger("13423424");
    BigInteger num = BigInteger.valueOf(5);
    BigInteger one = BigInteger.ONE;

    BigInteger result = one.add(num);

    System.out.println(result);
  }
}
