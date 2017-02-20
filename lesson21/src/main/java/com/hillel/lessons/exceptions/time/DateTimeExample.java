package com.hillel.lessons.exceptions.time;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {
  public static void main(String[] args) {

    City city = new City("Odessa", new Date(1835, 10, 10));

    Date foundation = city.getFoundation();
    foundation.setYear(2000);

    System.out.println(foundation);

    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

    LocalDate found = LocalDate.of(1835, 9, 9);
    System.out.println(found);

    Instant instant = Instant.now();
    instant.getNano();
  }
}
