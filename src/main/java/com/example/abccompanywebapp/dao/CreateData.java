package com.example.abccompanywebapp.dao;

import com.example.abccompanywebapp.model.Claim;
import com.example.abccompanywebapp.model.Product;
import com.example.abccompanywebapp.model.RegisteredProduct;
import com.example.abccompanywebapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class CreateData {
    private Connection con;
    private PreparedStatement statement;

    //INSERT DATA TO USERS TABLE
    public int insertData(User user) {
        int result = 0;
        try {
            con = DbConnection.getConnection();
            String sql = "INSERT INTO users (username,password,email,cellphone,first_name,last_name,address) VALUES (?,?,?,?,?,?,?)";
            statement = con.prepareStatement(sql);
            statement.setString(1,user.getUserName());
            statement.setString(2,user.getPassword());
            statement.setString(3,user.getEmail());
            statement.setString(4,user.getPhone());
            statement.setString(5,user.getFname());
            statement.setString(6,user.getLname());
            statement.setString(7,user.getAddress());

            result = statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    //INSERT DATA TO PRODUCTS TABLE
    public int insertData(Product product) {
        int result = 0;

        return result;
    }

    //INSERT DATA TO CLAIMS TABLE
    public int insertData(Claim claim) {
        int result = 0;

        return result;
    }

    //INSERT DATA TO REGISTERED PRODUCT TABLE
    public int insertData(RegisteredProduct regProd) {
        int result = 0;
        try {
        con = DbConnection.getConnection();
        String sql = "INSERT INTO registered_products VALUES (null,?,(Select productid From products where product_name = ?),?,?)";
        statement = con.prepareStatement(sql);
        statement.setString(1, regProd.getUser());
        statement.setString(2,regProd.getProdId());
        statement.setString(3, regProd.getSerial());
        statement.setString(4, regProd.getpDate());

        result = statement.executeUpdate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
        return result;
    }

}
