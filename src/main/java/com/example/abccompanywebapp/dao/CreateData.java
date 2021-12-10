package com.example.abccompanywebapp.dao;

import com.example.abccompanywebapp.model.Claim;
import com.example.abccompanywebapp.model.Product;
import com.example.abccompanywebapp.model.RegisteredProduct;
import com.example.abccompanywebapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class CreateData {
    private Connection con;

    public int insertData(User user) {
        int result = 0;
        try {
            con = DbConnection.getConnection();
            String sql = "INSERT INTO users VALUES (null,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,user.getUserName());
            statement.setString(2,user.getPassword());
            statement.setString(3,user.getEmail());
            statement.setString(4,user.getPhone());
            statement.setString(5,user.getFname());
            statement.setString(6,user.getLname());

            result = statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public int insertData(Product product) {
        int result = 0;

        return result;
    }

    public int insertData(Claim claim) {
        int result = 0;

        return result;
    }

    public int insertData(RegisteredProduct regProd) {
        int result = 0;

        return result;
    }


}
