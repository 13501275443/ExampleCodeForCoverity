package com.code.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JButton;


class DeserializeUntrustedData {
  public String getButtonText() {
    final File file = new File("Test.obj");
    String ret = "";
    try (FileInputStream fileInputStream = new FileInputStream(file);
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
      final JButton jbutton = (JButton) objectInputStream.readObject();
      ret = jbutton.getText();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.toString());
    }
    return ret;
  }
}
