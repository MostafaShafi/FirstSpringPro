package com.example.shesh.Services;

import com.example.shesh.Models.Users;
import com.example.shesh.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersService {
    @Autowired
    UsersRepository repository;

    public Users getUserById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<Users> getUsers() {
        ArrayList<Users> usersList = new ArrayList<>();
        repository.findAll().forEach(user -> usersList.add(user));
        return usersList;
    }

    public Users setUser(Users users) {
        return repository.save(users);
    }

    public Users updateUser(Users users) {
        return repository.save(users);
    }

    public void deleteUserById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteUser(Users users) {
        repository.delete(users);
    }

    public void deleteAllUsers() {
        repository.deleteAll();
    }
}
