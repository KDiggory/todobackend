package com.bae.todo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.bae.todo.dto.CompletedDTO;
import com.bae.todo.entity.Completed;
import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;
import com.bae.todo.repo.CompletedRepo;

@Service
public class CompletedService {
	
	public CompletedRepo repo;
	
	private ModelMapper mapper;
		

	public CompletedService(CompletedRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	

	public Completed createCompleted(Completed completed) {
		return this.repo.save(completed);
	}

	public boolean deleteItems(Integer id, Object object) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public List<Completed> getAllComplete() {
		return this.repo.findAll();
		
	}
	
	private CompletedDTO mapToDTO(ListName list) {
		CompletedDTO dto = new CompletedDTO();
		dto.setName(list.getName());
		dto.setDescription(list.getDescription());
		dto.setId(list.getId());
		return dto;	
	}


}
