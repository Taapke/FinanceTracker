package com.bergsma.financetracker.controller;

import com.bergsma.financetracker.model.User;
import com.bergsma.financetracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        System.out.println(user.toString());
        userRepository.save(user);
    }
}
