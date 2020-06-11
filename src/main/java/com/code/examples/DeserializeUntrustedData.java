package com.code.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializeUntrustedData {
  public void writeResponse() {
    try {
      final String file = System.in.toString();
      final FileInputStream fileInputStream = new FileInputStream(file);
      final int max = 100;
      final byte[] bytes = new byte[max];
      final int bytesRead = fileInputStream.read(bytes, 0, max);
      System.out.println(bytesRead);
    } catch (final IOException e) {
      System.out.println(e.toString());
    }
  }

  public String getEmployeeName() {
    final File file = new File("Test1.obj");
    String ret = "";
    final int newId = 1001;
    try (FileInputStream fileInputStream = new FileInputStream(file);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
      final Employee employee = (Employee) objectInputStream.readObject();
      employee.setId(newId);
      ret = employee.getName();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.toString());
    }
    return ret;
  }
}
