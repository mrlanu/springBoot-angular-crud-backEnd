package com.lanu.crud_springboot_angular_backend.controllers;

import com.lanu.crud_springboot_angular_backend.entities.User;
import com.lanu.crud_springboot_angular_backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findByUserId(id);
    }

    @DeleteMapping("/user/{id}")
    public boolean delUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return true;
    }

    @PostMapping("/user")
    public User createUser(User user){
        return userRepository.save(user);
    }

    @PutMapping("/user")
    public User updateUser(User user){
        return userRepository.save(user);
    }
}
