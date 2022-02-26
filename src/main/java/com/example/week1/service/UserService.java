package com.example.week1.service;

import com.example.week1.models.Users;
import com.example.week1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List getAllUser(){
        return userRepository.findAll();
    }


    public Optional<Users> getUser(String name){
        return userRepository.findByName(name);
    }

    public void addUser(Users user) {
        userRepository.save(user);
    }

    public void deleteUser(long id) {
        userRepository.deleteById((int) id);
    }

    public void updateUser(Users users) {
        Users user = userRepository.findById(users.getId()).orElse(null);

        user.setName(users.getName());
        user.setAddress(users.getAddress());
        user.setEmail(users.getEmail());
        user.setTelephone(users.getTelephone());
        user.setId(users.getId());
        user.setZipcode(users.getZipcode());
        user.setArea(users.getArea());
        user.setProvince(users.getProvince());
        userRepository.save(user);


    }


}
