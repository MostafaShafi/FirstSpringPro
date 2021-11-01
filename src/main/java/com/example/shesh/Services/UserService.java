package com.example.shesh.Services;

import com.example.shesh.Models.User;
import com.example.shesh.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User getUserById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<User> getUsers() {
        ArrayList<User> userList = new ArrayList<>();
        repository.findAll().forEach(user -> userList.add(user));
        return userList;
    }

    public User setUser(User user) {
        return repository.save(user);
    }

    public User updateUser(User user) {
        return repository.save(user);
    }

    public void deleteUserById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteUser(User user) {
        repository.delete(user);
    }

    public void deleteAllUsers() {
        repository.deleteAll();
    }
}
