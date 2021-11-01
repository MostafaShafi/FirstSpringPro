package com.example.shesh.Repositories;

import com.example.shesh.Models.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends CrudRepository<Master, Integer> {
}
