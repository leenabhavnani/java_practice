package com.example.demo.services;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();

    public UserService()
    {
        userList.add(new User("Leena","Leena","12345"));
        userList.add(new User("Mark","Mark","12345"));
    }

    public List<User> getUserList()
    {
        return userList;
    }
    public User getUser(String userName)
    {
        return userList.stream().filter(user ->user.getUserName().equalsIgnoreCase(userName)).findFirst().orElse(null);
    }

    public User addUser(User user)
    {
        userList.add(user);
        return user;
    }
}
