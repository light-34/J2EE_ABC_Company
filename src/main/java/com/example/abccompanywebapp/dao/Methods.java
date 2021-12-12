package com.example.abccompanywebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Methods {
    private Connection con;

    //This method is used to call all products in DB
    public List<String> products() {
        List<String> prodList = new ArrayList<>();
        try {
            con = DbConnection.getConnection();
            String query = "Select * from products";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                prodList.add(resultSet.getString("product_name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  prodList;
    }
}
