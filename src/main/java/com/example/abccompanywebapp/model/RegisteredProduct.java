package com.example.abccompanywebapp.model;

public class RegisteredProduct {
    private String user;
    private String prodId;
    private String serial;
    private String pDate;

    public RegisteredProduct(String user, String prodId, String serial, String pDate) {
        this.user = user;
        this.prodId = prodId;
        this.serial = serial;
        this.pDate = pDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    /* public RegisteredProduct(String user, int prodId, String serial, String pDate) {
        this.user = user;
        this.prodId = prodId;
        this.serial = serial;
        this.pDate = pDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }*/
}
