package com.code.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeak {
  public String readFromFile(final String filename) {
    String ret = "";
    try {
      final FileReader fileReader = new FileReader(filename);
      final BufferedReader bufferedReader = new BufferedReader(fileReader);
      //try {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        ret += line;
      }
      /*} finally {
        bufferedReader.close();
        fileReader.close();
      }*/
    } catch (final IOException e) {
      System.out.println(e.toString());
    }

    return ret;
  }
}
