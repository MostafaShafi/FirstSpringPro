package com.example.shesh.Controllers;

import com.example.shesh.Models.Grade;
import com.example.shesh.Services.GradeService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GradeController {

    @Autowired
    GradeService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addgrade")
    public Grade addGrade(@Valid @RequestBody Grade grade, BindingResult result) {
        return service.setGrade(grade);
    }

    @PutMapping("/editgrade/{id}")
    public Grade updateGrade(@PathVariable(value = "id") Long id, @Valid @RequestBody Grade grade) {
        return service.updateGrade(grade);
    }

    @GetMapping("/grade/{id}")
    public String getGrade(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getGradeById(id));
    }

    @GetMapping("/grades")
    public String getGrades() {
        return gson.toJsonTree(service.getGrades()).toString();
    }

    @DeleteMapping("/deletegrade/{id}")
    public void deleteGrade(@PathVariable(value = "id") Long id) {
        service.deleteGradeById(id);
    }

    @DeleteMapping("/deletegrade")
    public void deleteGrade(@Valid @RequestBody Grade grade) {
        service.deleteGrade(grade);
    }

    @DeleteMapping("/deleteallgrades")
    public void deleteAllGrades() {
        service.deleteAllGrades();
    }
}
