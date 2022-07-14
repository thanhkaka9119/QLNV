package com.example.appqlsv.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(name = "first_name")
  private String firstName;
  @Column
  private int age;
  @Column
  private String address;

  public User(){}

  public User(long id, String firstName, int age, String address) {
    this.id = id;
    this.firstName = firstName;
    this.age = age;
    this.address = address;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
