package com.bae.todo.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.bae.todo.entity.ListName;

@Repository
public interface ListNameRepo extends MongoRepository<ListName, Integer> {

	ListName findByName(String name);

}
