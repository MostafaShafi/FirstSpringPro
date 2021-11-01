package com.example.shesh.Controllers;

import com.example.shesh.Models.Field;
import com.example.shesh.Services.FieldService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class FieldController {

    @Autowired
    FieldService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addfield")
    public Field addField(@Valid @RequestBody Field field, BindingResult result) {
        return service.setField(field);
    }

    @PutMapping("/editfield/{id}")
    public Field updateField(@PathVariable(value = "id") Long id, @Valid @RequestBody Field field) {
        return service.updateField(field);
    }

    @GetMapping("/field/{id}")
    public String getField(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getFieldById(id));
    }

    @GetMapping("/fields")
    public String getFields() {
        return gson.toJsonTree(service.getFields()).toString();
    }

    @DeleteMapping("deletefield/{id}")
    public void deleteField(@PathVariable(value = "id") Long id) {
        service.deleteFieldById(id);
    }

    @DeleteMapping("deletefield")
    public void deleteField(@Valid @RequestBody Field field) {
        service.deleteField(field);
    }

    @DeleteMapping("deleteallfields")
    public void deleteAllFields() {
        service.deleteAllFields();
    }
}
