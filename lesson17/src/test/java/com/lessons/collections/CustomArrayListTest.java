package com.lessons.collections;

import org.junit.Test;

import java.util.NoSuchElementException;

public class CustomArrayListTest {

  @Test(expected = NoSuchElementException.class)
  public void testRemoval() {
    CustomList list = new CustomArrayList();
    list.indexOf("asdfsdf");
  }
}
