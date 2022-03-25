package com.bae.todo.repo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.todo.entity.Items;

@Repository
public interface ItemRepo extends MongoRepository<Items, Integer> {

//	List<Items> findByList_Id(Integer list_id); 
	
	void deleteByQuickId(Integer id);

}