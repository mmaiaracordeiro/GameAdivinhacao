package org.example.controller;


import org.example.model.User;

public class LoginController {
    public static User authenticate(String email, String password) {
        return User.authenticate(email, password);
    }
}
