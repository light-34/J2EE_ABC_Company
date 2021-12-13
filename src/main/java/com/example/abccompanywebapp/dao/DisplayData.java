package com.example.abccompanywebapp.dao;

import com.example.abccompanywebapp.model.Product;
import com.example.abccompanywebapp.model.RegisteredProduct;
import com.example.abccompanywebapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DisplayData {
    private Connection con;
    private PreparedStatement statement;
    private ResultSet resultSet;

    //This method is used to call all users in DB
    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        try {
            con = DbConnection.getConnection();

            String query = "Select * From users";
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("first_name");
                String lname = resultSet.getString("last_name");
                String username = resultSet.getString("username");
                String phone = resultSet.getString("cellphone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                usersList.add(new User(name, lname, address, phone, email, username));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  usersList;
    }

    //This method is used to call all Registered Devices in DB
    public List<RegisteredProduct> getAllRegisteredDevices() {
        List<RegisteredProduct> regDevList = new ArrayList<>();
        try {
            con = DbConnection.getConnection();
            String query = "Select * From registered_products";
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String prodId = resultSet.getString("product_id");
                String serial = resultSet.getString("serial_no");
                String pdate = resultSet.getString("purchase_date");
                regDevList.add(new RegisteredProduct(username, prodId, serial, pdate));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  regDevList;
    }

    //This method is used to call all Products in DB
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        try {
            con = DbConnection.getConnection();
            String query = "Select * From products";
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String prodName = resultSet.getString("product_name");
                productList.add(new Product(prodName));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  productList;
    }

}
