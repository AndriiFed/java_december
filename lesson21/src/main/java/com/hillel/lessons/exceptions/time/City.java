package com.hillel.lessons.exceptions.time;

import java.util.Date;

public class City {
  private String name;
  private Date foundation;

  public City(String name, Date foundation) {
    this.name = name;
    this.foundation = foundation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getFoundation() {
    return new Date(foundation.getYear(),
        foundation.getMonth(),
        foundation.getDay());
  }

  public void setFoundation(Date foundation) {
    this.foundation = foundation;
  }
}
