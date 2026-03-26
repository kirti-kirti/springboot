package com.springboot_project.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_project.springboot.model.User;
import com.springboot_project.springboot.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository repo;

    // ✅ Add User
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }

    // ✅ Get All Users
    @GetMapping("/users")
    public List<User> getUsers() {
        return repo.findAll();
    }

    // ✅ Delete User
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        if (!repo.existsById(id)) {
            return "User not found";
        }
        repo.deleteById(id);
        return "User deleted successfully";
    }

    // ✅ Update User (BEST PRACTICE)
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {

        User existingUser = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());

        return repo.save(existingUser);
    }
}