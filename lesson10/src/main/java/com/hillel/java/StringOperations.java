package com.hillel.java;

public class StringOperations {
  public static void main(String[] args) {

    String str = "hello";
    String str3 = "hello";
    String str2 = new String("hello");

    char res = str.charAt(3);
    System.out.println(res);

    String str4 = str3.concat(" world"); //str3 + " world";
    System.out.println(str4);

    String str5 = "    some   thing   ";
    String str6 = str5.trim();
    System.out.println(str6);

    String str7 = "hello world";
    String str8 = str7.replace("hello", "goodbye");
    System.out.println(str8);

    String str9 = str7.substring(2, 6);
    System.out.println(str9);

    String str10 = "goodbye good goodbyeworld";
    String str11 = str10.replace("good", "not");
    System.out.println(str11);

    String str12 = "s1;s2;s3;s4;s5";
    String[] array = str12.split(";");

    String str13 = String.join("-", array);
  }
}
