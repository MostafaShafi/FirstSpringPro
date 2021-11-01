package com.example.shesh.Services;

import com.example.shesh.Models.Author;
import com.example.shesh.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository repository;

    public Author getAuthorById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<Author> getAuthors() {
        ArrayList<Author> authorList = new ArrayList<>();
        repository.findAll().forEach(author -> authorList.add(author));
        return authorList;
    }

    public Author setAuthor(Author author) {
        return repository.save(author);
    }

    public Author updateAuthor(Author author) {
        return repository.save(author);
    }

    public void deleteAuthorById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllAuthors() {
        repository.deleteAll();
    }

    public void deleteAuthor(Author author) {
        repository.delete(author);
    }
}
