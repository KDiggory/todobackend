package com.bae.todo.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.bae.todo.dto.ItemsDTO;
import com.bae.todo.dto.ListNameDTO;
import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;
import com.bae.todo.repo.ItemRepo;

import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class ItemService {

	public ItemRepo repo;

	private ModelMapper mapper;

	public ItemService(ItemRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}


	public Items createItems(Items items ) {
		return this.repo.save(items);
	}
	
	public Items updateItems(Items Items, Integer id) {
		Items toUpdate = this.repo.findById(id).get();
		toUpdate.setName(Items.getName());
		toUpdate.setDescription(Items.getDescription());
		toUpdate.setDate(Items.getDate());
		toUpdate.setList_id(Items.getList_id());
		return this.repo.save(toUpdate);
	}
	
	public boolean deleteItems(Integer id, Object object) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public Items getItemsById(Integer id) {
		return this.repo.findById(id).get();
	}
	
	public List<Items> getAllItems() {
		return this.repo.findAll();
		
	}
//	public List<Items> getItemssFromList(ListName list) {	
//		return this.repo.findByList(list);
//	}
	
	private ItemsDTO mapToDTO(ListName list) {
		ItemsDTO dto = new ItemsDTO();
		dto.setName(list.getName());
		dto.setDescription(list.getDescription());
		dto.setId(list.getId());
		return dto;		
	}

	public List<Items> getByList(Integer id) {
		return this.repo.getByList(id); 
	}

}

