package com.example.abccompanywebapp.model;

public class User {

    private String fname;
    private String lname;
    private String address;
    private String phone;
    private String email;
    private String userName;
    private String password;
    private String adminCheck;

    public User(String fname, String lname, String address, String phone, String email, String userName, String password) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public User(String fname, String lname, String address, String phone, String email, String userName) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.userName = userName;
    }

    public User(String adminCheck ) {
        this.adminCheck = adminCheck;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminCheck() {
        return adminCheck;
    }

    public void setAdminCheck(String adminCheck) {
        this.adminCheck = adminCheck;
    }
}
