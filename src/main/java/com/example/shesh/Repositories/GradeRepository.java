package com.example.shesh.Repositories;

import com.example.shesh.Models.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Integer> {
}