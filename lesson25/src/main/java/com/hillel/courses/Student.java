package com.hillel.courses;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  //@Column(name = "name")
  private String name;

  private String sname;

  public Student() {
  }

  public Student(String name, String sname) {
    this.name = name;
    this.sname = sname;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }
}
