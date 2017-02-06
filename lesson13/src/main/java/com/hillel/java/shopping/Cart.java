package com.hillel.java.shopping;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {
  private int count;
  private ArrayList<Product> products;
  private static final int MAX_AMOUNT = 10;

  public Cart() {
    count = 0;
    products = new Product[MAX_AMOUNT];
  }

  public void addProduct(Product product) {
    products.add(product);
    count++;
  }

  public void deleteProduct() {
    count--;
    products.remove(count);
  }

  @Override
  public String toString() {
    return Arrays.toString(products);
  }
}
