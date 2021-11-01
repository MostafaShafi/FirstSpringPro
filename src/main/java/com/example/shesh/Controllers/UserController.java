package com.example.shesh.Controllers;

import com.example.shesh.Models.User;
import com.example.shesh.Services.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserService service;
    @Autowired
    private Gson gson;

    @PostMapping("/adduser")
    public User addUser(@Valid @RequestBody User user, BindingResult result) {
        return service.setUser(user);
    }

    @PutMapping("/edituser/{id}")
    public User updateUser(@PathVariable(value = "id") Long id, @Valid @RequestBody User user) {
        return service.updateUser(user);
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getUserById(id));
    }

    @GetMapping("/users")
    public String getUsers() {
        return gson.toJsonTree(service.getUsers()).toString();
    }

    @DeleteMapping("deleteuser/{id}")
    public void deleteUser(@PathVariable(value = "id") Long id) {
        service.deleteUserById(id);
    }

    @DeleteMapping("deleteuser")
    public void deleteUser(@Valid @RequestBody User user) {
        service.deleteUser(user);
    }

    @DeleteMapping("deleteallusers")
    public void deleteAllUsers() {
        service.deleteAllUsers();
    }
}
