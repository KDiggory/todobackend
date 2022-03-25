package com.bae.todo.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.todo.entity.Completed;

@Repository
public interface CompletedRepo extends MongoRepository<Completed, Integer> {

}
