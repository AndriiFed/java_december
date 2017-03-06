package com.hillel.java.lesson24;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcExample {
  public static void main(String[] args) throws SQLException, IOException {

    JdbcExample jdbcExample = new JdbcExample();
    Properties properties = jdbcExample.loadProperties();

    Connection connection =
        DriverManager.getConnection(
            properties.getProperty("url"),
            properties.getProperty("user"),
            properties.getProperty("password"));

    System.out.println("connection established");

    jdbcExample.addStudent(connection);
    jdbcExample.printStudents(connection);
  }

  private Properties loadProperties() throws IOException {
    InputStream inputStream = this.getClass().getResourceAsStream("db.properties");

    Properties properties = new Properties();
    properties.load(inputStream);

    return properties;
  }

  public void printStudents(Connection connection) throws SQLException {
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from students");

    while (resultSet.next()) {
      String name = resultSet.getString("name");
      String sname = resultSet.getString("sname");

      System.out.println(name + " " + sname);
    }
  }

  public void addStudent(Connection connection) throws SQLException {
    PreparedStatement statement =
        connection.prepareStatement("insert into students(name, sname) values(?, ?)");

    statement.setString(1, "Katty");
    statement.setString(2, "Perry");

    statement.execute();
  }
}
