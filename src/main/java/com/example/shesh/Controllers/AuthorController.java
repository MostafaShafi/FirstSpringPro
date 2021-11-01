package com.example.shesh.Controllers;

import com.example.shesh.Models.Author;
import com.example.shesh.Services.AuthorService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AuthorController {

    @Autowired
    AuthorService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addauthor")
    public Author addAuthor(@Valid @RequestBody Author author, BindingResult result) {
        return service.setAuthor(author);
    }

    @PutMapping("/editauthor/{id}")
    public Author updateAuthor(@PathVariable(value = "id") Long id, @Valid @RequestBody Author author) {
        return service.updateAuthor(author);
    }

    @GetMapping("/author/{id}")
    public String getAuthor(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getAuthorById(id));
    }

    @GetMapping("/authors")
    public String getAuthors() {
        return gson.toJsonTree(service.getAuthors()).toString();
    }

    @DeleteMapping("deleteauthor/{id}")
    public void deleteAuthor(@PathVariable(value = "id") Long id) {
        service.deleteAuthorById(id);
    }

    @DeleteMapping("deleteauthor")
    public void deleteAuthor(@Valid @RequestBody Author author) {
        service.deleteAuthor(author);
    }

    @DeleteMapping("deleteallauthors")
    public void deleteAllAuthors() {
        service.deleteAllAuthors();
    }
}
