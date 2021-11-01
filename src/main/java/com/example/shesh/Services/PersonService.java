package com.example.shesh.Services;

import com.example.shesh.Models.Person;
import com.example.shesh.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Person getPersonById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<Person> getPersons() {
        ArrayList<Person> personList = new ArrayList<>();
        repository.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    public Person setPerson(Person person) {
        return repository.save(person);
    }

    public Person updatePerson(Person person) {
        return repository.save(person);
    }

    public void deletePersonById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllPersons() {
        repository.deleteAll();
    }

    public void deletePerson(Person person) {
        repository.delete(person);
    }
}
