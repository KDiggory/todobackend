package com.bae.todo.dto;

import java.util.Objects;

import com.bae.todo.entity.ListName;

public class ItemsDTO {
	
	private Integer id;
	private String name;
	private String description;
	private String date;
	private ListName list;
	
	
	public ItemsDTO() {
		super();
	}


	public ItemsDTO(Integer id, String name, String description, String date, ListName list) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.list = list;
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


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public ListName getList() {
		return list;
	}


	public void setList(ListName list) {
		this.list = list;
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, description, id, list, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemsDTO other = (ItemsDTO) obj;
		return Objects.equals(date, other.date) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(list, other.list) && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "ItemsDTO [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", list="
				+ list + "]";
	}
	
	

}
