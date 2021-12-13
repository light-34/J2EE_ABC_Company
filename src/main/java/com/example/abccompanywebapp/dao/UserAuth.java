package com.example.abccompanywebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserAuth {
    private Connection con;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public boolean prodAuthorize(String userName) {
        boolean isUser = false;
        try {
            con = DbConnection.getConnection();
            String sql = "Select username from users where username= ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, userName);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                isUser = true;
            }
        } catch (Exception ex) {
            System.out.println("Product authorization Failed");
            ex.printStackTrace();
        }
        return isUser;
    }

    public boolean userAuthorize(String userName, String password) {
        boolean isUserExist = false;
        try {
            con = DbConnection.getConnection();
            String sql = "Select username from users where username= ? and password = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, userName);
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                isUserExist = true;
            }
        } catch (Exception ex) {
            System.out.println("User authorization Failed");
            ex.printStackTrace();
        }

        return isUserExist;
    }
}
