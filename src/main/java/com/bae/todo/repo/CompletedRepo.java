package com.bae.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.todo.entity.Completed;
import com.bae.todo.entity.Items;

@Repository
public interface CompletedRepo extends JpaRepository<Completed, Integer> {

}
