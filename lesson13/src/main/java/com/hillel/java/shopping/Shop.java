package com.hillel.java.shopping;

public class Shop {
  public static void main(String[] args) {
    Product tv = new Product("Panasonic", 500);
    Product iron = new Product("Bosh", 350);
    Product coffeeMachine = new Product("Samsung", 200);

    Cart cart = new Cart();
    cart.addProduct(tv);
    cart.addProduct(iron);
    cart.addProduct(coffeeMachine);

    System.out.println(cart);
  }
}
