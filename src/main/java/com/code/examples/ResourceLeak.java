package com.code.examples;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class ResourceLeak {
  public String readFromFile(final String filename) {
    String ret = "";
    try {
      final InputStream fileReader = new FileInputStream(filename);
      final Reader reader = new InputStreamReader(fileReader, "UTF-8");
      final BufferedReader bufferedReader = new BufferedReader(reader);
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
      final Statement statement = conn.createStatement();
      if (statement.execute("update employee set name='test' where id=5")) {
        System.out.println("Update employee table successfully");
      }
      conn.close();
    } catch (final SQLException e) {
      System.out.println(e.toString());
    }
  }

}
