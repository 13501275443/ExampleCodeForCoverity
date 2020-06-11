package com.code.examples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable {
  private int id;
  private String name;

  public Employee() {
  }

  public int getId() {
    return id;
  }

  public void setId(final int empId) {
    id = empId;
  }

  public String getName() {
    return name;
  }

  public void setName(final String empName) {
    name = empName;
  }

  private  void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    this.name = this.name + " virus attack!!!";
  }
}
