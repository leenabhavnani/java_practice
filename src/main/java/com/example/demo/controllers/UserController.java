package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getUserList();
    }
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return userService.getUser(username);
    }
    @PostMapping("/")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
}
