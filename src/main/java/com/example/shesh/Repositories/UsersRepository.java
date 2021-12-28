package com.example.shesh.Repositories;

import com.example.shesh.Models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
}
