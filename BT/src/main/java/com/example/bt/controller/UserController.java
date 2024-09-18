package com.example.bt.controller;

import com.example.bt.model.User;
import com.example.bt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestParam String email, @RequestParam String password) {
        return userService.registerUser(email, password);
    }

    @PostMapping("/login")
    public User login(@RequestParam String email, @RequestParam String password) {
        return userService.loginUser(email, password);
    }
}
