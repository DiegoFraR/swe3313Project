package com.example.swe3313implementation.User;

import java.util.UUID;
import java.util.UUID.*;

public class User {


    private final UUID userID = UUID.randomUUID();
    private String SUUID = userID.toString();
    //
    private String email;
    private String password;
    private String name;
    private boolean isAdmin = false;
    private static User instance;


    //Constructors
    public User(String email, String password, String name, boolean isAdmin) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    private User(String userID, boolean isAdmin){
        this.SUUID = userID;
        this.isAdmin = isAdmin;
    }

    public static User getInstance(String userID, boolean isAdmin){
        if (instance == null){
            instance = new User(userID, isAdmin);
        }
        return instance;
    }

    public void cleanUserSession(){
        SUUID = null;
        isAdmin = false;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "userID='" + SUUID + '\'' +
                ", privileges=" + isAdmin +
                '}';
    }

    //Getters
    private UUID getUserID(){
        return userID;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    public boolean isAdmin() {
        return isAdmin;
    }

    //Setters

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    //Methods
}
