package com.bae.todo.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ListName {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer list_id;
	
	private String name;
	
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy="name")
	private List<Items> items;

	public ListName(Integer list_id, String name, String description, List<Items> items) {
		super();
		this.list_id = list_id;
		this.name = name;
		this.description = description;
		this.items = items;
	}

	public ListName() {
		super();
	}

	public Integer getId() {
		return list_id;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public void setId(Integer list_id) {
		this.list_id = list_id;
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

	@Override
	public int hashCode() {
		return Objects.hash(description, list_id, items, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListName other = (ListName) obj;
		return Objects.equals(description, other.description) && Objects.equals(list_id, other.list_id)
				&& Objects.equals(items, other.items) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "ListName [list_id=" + list_id + ", name=" + name + ", description=" + description + ", items=" + items + "]";
	}

	

	
	
	

	

}

