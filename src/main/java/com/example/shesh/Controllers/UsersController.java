package com.example.shesh.Controllers;

import com.example.shesh.Models.Users;
import com.example.shesh.Services.UsersService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UsersController {

    @Autowired
    UsersService service;
    @Autowired
    private Gson gson;

    @PostMapping("/adduser")
    public Users addUser(@Valid @RequestBody Users users, BindingResult result) {
        return service.setUser(users);
    }

    @PutMapping("/edituser/{id}")
    public Users updateUser(@PathVariable(value = "id") Long id, @Valid @RequestBody Users users) {
        return service.updateUser(users);
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
    public void deleteUser(@Valid @RequestBody Users users) {
        service.deleteUser(users);
    }

    @DeleteMapping("deleteallusers")
    public void deleteAllUsers() {
        service.deleteAllUsers();
    }
}
