package com.example.shesh.Controllers;

import com.example.shesh.Models.Student;
import com.example.shesh.Services.StudentService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    StudentService service;
    @Autowired
    private Gson gson;

    @PostMapping("/addstudent")
    public Student addStudent(@Valid @RequestBody Student student, BindingResult result) {
        return service.setStudent(student);
    }

    @PutMapping("/editstudent/{id}")
    public Student updateStudent(@PathVariable(value = "id") Long id, @Valid @RequestBody Student student) {
        return service.updateStudent(student);
    }

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable(value = "id") Long id) {
        return gson.toJson(service.getStudentById(id));
    }

    @GetMapping("/students")
    public String getStudents() {
        return gson.toJsonTree(service.getStudents()).toString();
    }

    @DeleteMapping("deletestudent/{id}")
    public void deleteStudent(@PathVariable(value = "id") Long id) {
        service.deleteStudentById(id);
    }

    @DeleteMapping("deletestudent")
    public void deleteStudent(@Valid @RequestBody Student student) {
        service.deleteStudent(student);
    }

    @DeleteMapping("deleteallstudents")
    public void deleteAllStudents() {
        service.deleteAllStudents();
    }
}
