package org.launchcode.models;

import java.util.Date;

public class User {
    private int id;
    private static int nextId=1;
    private String userName;
    private String password;
    private String email;
    private Date date;

    public User(String userName, String password, String email, Date date) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.id = nextId++;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
