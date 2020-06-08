package com.code.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

  public void openConnection(final String connectionString) {
    try {
      final Connection conn = DriverManager.getConnection(connectionString);
      conn.prepareCall("select * from test_table");
      conn.close();
    } catch (final SQLException e) {
      System.out.println(e.toString());
    }
  }

}
