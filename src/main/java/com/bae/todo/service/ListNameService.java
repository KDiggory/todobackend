package com.bae.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.todo.dto.ListNameDTO;
import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;
import com.bae.todo.repo.ListNameRepo;

@Service
public class ListNameService {
	
	public ListNameRepo repo;
	
	public ListNameService(ListNameRepo repo) {
		super();
		this.repo = repo;
	}

	public ListName createListName(ListName list) {
		return this.repo.save(list);
	
	}
	
	public ListName updateListName(ListName list, Integer id) {
		ListName toUpdate = this.repo.findById(id).get();
		toUpdate.setName(list.getName());
		toUpdate.setDescription(list.getDescription());
		return this.repo.save(toUpdate);
	}

	public List<ListName> getAllLists() {
		return this.repo.findAll();
	}

	public boolean deleteListName(Integer id, Object object) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public ListName getListNameById(Integer id) {
		return this.repo.findById(id).get(); 
	}
	
	public ListName getListNameByName(String name) {
		return this.repo.findByName(name); 
	}
	
	private ListNameDTO mapToDTO(Items items) {
	ListNameDTO dto = new ListNameDTO();
	dto.setName(items.getName());
	dto.setDescription(items.getDescription());
	dto.setId(items.getId());
	return dto;
	}

}
