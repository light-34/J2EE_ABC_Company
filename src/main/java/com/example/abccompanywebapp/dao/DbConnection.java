package com.example.abccompanywebapp.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DbConnection {

	private static Connection connection = null;

    public static Connection getConnection() throws Exception {

        try(InputStream input =Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties")) {
            Properties props = new Properties();
            props.load(input);

            Class.forName(props.getProperty("driver"));
            connection = DriverManager.getConnection(props.getProperty("url"), props.getProperty("user"), props.getProperty("password"));
            if (connection != null) {
                System.out.println("Connection Established");
            }
        } catch (IOException ex) {
            System.out.println("File could not be located");
            ex.printStackTrace();
        }
        return connection;
    }
}
