package com.example.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class User{
    private int id;
    private String userName;
    private String fullName;
    private String contactNo;
    private String eMail;
    private String password;
    private String role;

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public User( String userName, String fullName, String contactNo, String eMail, String password, String role) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.userName = userName;
        this.fullName = fullName;
        this.contactNo = contactNo;
        this.eMail = eMail;
        this.password = password;
        this.role = role;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


}
