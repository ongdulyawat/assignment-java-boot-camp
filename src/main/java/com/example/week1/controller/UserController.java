package com.example.week1.controller;

import com.example.week1.models.Users;
import com.example.week1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<Users> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/users/{name}")
    public Optional<Users> get(@PathVariable String name) {
        return userService.getUser(name);
    }

    @PostMapping("/users/add")
    public void addUser(@RequestBody Users users) {
        userService.addUser(users);
    }

    @DeleteMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/users/edit/{id}")
    public void updateUser(@RequestBody Users users){
        userService.updateUser(users);
    }




}
