package com.bae.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bae.todo.entity.Items;

@Repository
public interface ItemRepo extends JpaRepository<Items, Integer> {

	@Query("SELECT i from Items i WHERE i.list_id=?1")
	List<Items> getByList(Integer list_id); 
}