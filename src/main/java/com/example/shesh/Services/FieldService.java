package com.example.shesh.Services;

import com.example.shesh.Models.Field;
import com.example.shesh.Repositories.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FieldService {

    @Autowired
    FieldRepository repository;

    public Field getFieldById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<Field> getFields() {
        ArrayList<Field> fieldList = new ArrayList<>();
        repository.findAll().forEach(field -> fieldList.add(field));
        return fieldList;
    }

    public Field setField(Field field) {
        return repository.save(field);
    }

    public Field updateField(Field field) {
        return repository.save(field);
    }

    public void deleteFieldById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllFields() {
        repository.deleteAll();
    }

    public void deleteField(Field field) {
        repository.delete(field);
    }
}
