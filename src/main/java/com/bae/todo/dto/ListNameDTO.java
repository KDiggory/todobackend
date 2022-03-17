package com.bae.todo.dto;

import java.util.List;

public class ListNameDTO {
	
	private Integer id;
	private String name;
	private String description;
	private List<ItemsDTO> items;
	
	
	public ListNameDTO(Integer id, String name, String description, List<ItemsDTO> items) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.items = items;
	}


	public ListNameDTO() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<ItemsDTO> getItems() {
		return items;
	}


	public void setItems(List<ItemsDTO> items) {
		this.items = items;
	}
	
	

}
