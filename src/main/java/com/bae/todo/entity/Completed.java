package com.bae.todo.entity;

import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

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
public class Completed {
	
	@org.springframework.data.annotation.Id
	 public ObjectId id; // these need to be private but to get front end working will use public

	public String name;
	
	public String description;
	
	public String date;
	
	public Integer list_id;

	@PersistenceConstructor
	public Completed(String name, String description, String date, Integer list_id) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
		this.list_id = list_id;
	}

	
	
	@Override
	public String toString() {
		return "Completed [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date
				+ ", list_id=" + list_id + "]";
	}	
	
	

}
