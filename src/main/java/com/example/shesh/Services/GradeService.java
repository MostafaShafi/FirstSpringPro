package com.example.shesh.Services;

import com.example.shesh.Models.Grade;
import com.example.shesh.Repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GradeService {

    @Autowired
    GradeRepository repository;

    public Grade getGradeById(Long id) {
    return repository.findById(id.intValue()).get();
    }

    public ArrayList<Grade> getGrades() {
        ArrayList<Grade> gradeList = new ArrayList<>();
        repository.findAll().forEach(grade -> gradeList.add(grade));
        return gradeList;
    }

    public Grade setGrade(Grade grade) {
        return repository.save(grade);
    }

    public Grade updateGrade(Grade grade) {
        return repository.save(grade);
    }

    public void deleteGradeById(Long id) {
        repository.deleteById(id.intValue());
    }

    public void deleteAllGrades() {
        repository.deleteAll();
    }

    public void deleteGrade(Grade grade) {
        repository.delete(grade);
    }
}
