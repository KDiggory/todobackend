package com.bae.todo.entity;

import java.util.List;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Document
public class ListName {
	
	@org.springframework.data.annotation.Id
	public ObjectId list_id; // these need to be private but to get front end working will use public
	
	public String name;
	
	public String description;
	
	public List<Items> items;

	@PersistenceConstructor
	public ListName(String name, String description, List<Items> items) {
		super();
		this.name = name;
		this.description = description;
		this.items = items;
	}
	
	
	@Override
	public String toString() {
		return "ListName [list_id=" + list_id + ", name=" + name + ", description=" + description + ", items=" + items + "]";
	}

	

	
	
	

	

}

