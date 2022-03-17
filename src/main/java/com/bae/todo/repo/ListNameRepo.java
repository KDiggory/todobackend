package com.bae.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;

@Repository
public interface ListNameRepo extends JpaRepository<ListName, Integer> {

	ListName findByName(String name);

}
