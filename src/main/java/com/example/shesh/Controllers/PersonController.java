package com.example.shesh.Controllers;

import com.example.shesh.Models.Person;
import com.example.shesh.Services.PersonService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PersonController {

    @Autowired
    PersonService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addperson")
    public Person addPerson(@Valid @RequestBody Person person, BindingResult result) {
        return service.setPerson(person);
    }

    @PutMapping("/editperson/{id}")
    public Person updatePerson(@PathVariable(value = "id") Long id, @Valid @RequestBody Person person) {
        return service.updatePerson(person);
    }

    @GetMapping("/person/{id}")
    public String getPerson(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getPersonById(id));
    }

    @GetMapping("/persons")
    public String getPersons() {
        return gson.toJsonTree(service.getPersons()).toString();
    }

    @DeleteMapping("deleteperson/{id}")
    public void deletePerson(@PathVariable(value = "id") Long id) {
        service.deletePersonById(id);
    }

    @DeleteMapping("deleteperson")
    public void deletePerson(@Valid @RequestBody Person person) {
        service.deletePerson(person);
    }

    @DeleteMapping("deleteallpersons")
    public void deleteAllPersons() {
        service.deleteAllPersons();
    }
}
