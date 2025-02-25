package com.example.bookingsystem.controller;

import com.example.bookingsystem.model.User;
import com.example.bookingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String role) {
        return userService.registerUser(username, password, role);
    }
}
