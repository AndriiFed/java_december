package com.hillel.java.shopping;

import java.util.Arrays;

public class Cart {
  private int count;
  private Product[] products;
  private static final int MAX_AMOUNT = 10;

  public Cart() {
    count = 0;
    products = new Product[MAX_AMOUNT];
  }

  public void addProduct(Product product) {
    if (count == MAX_AMOUNT) {
      System.out.println("Корзина заполнена");
      return;
    }
    products[count] = product;
    count++;
  }

  public void deleteProduct() {
    if (count == 0) {
      System.out.println("Больше не сущетвует товаров в корзине");
      return;
    }

    count--;
    products[count] = null;
  }

  @Override
  public String toString() {
    return Arrays.toString(products);
  }
}
