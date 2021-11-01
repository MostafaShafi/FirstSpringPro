package com.example.shesh.Services;

import com.example.shesh.Models.Student;
import com.example.shesh.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student getStudentById(Long id) {
        return repository.findById(id.intValue()).get();
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> studentList = new ArrayList<>();
        repository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }

    public Student setStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    public void deleteStudentById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllStudents() {
        repository.deleteAll();
    }

    public void deleteStudent(Student student) {
        repository.delete(student);
    }
}
