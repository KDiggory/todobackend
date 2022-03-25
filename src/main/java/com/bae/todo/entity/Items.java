package com.bae.todo.entity;

import java.util.List;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
//@ builder - so dont need all the different constructors
// annotation for no args and all args constructors with lombok
// check connecting to right database
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Document
public class Items {
	
	@org.springframework.data.annotation.Id
	public ObjectId id; // these need to be private but to get front end working will use public 
	
//	@Transient
//    public static final String SEQUENCE_NAME = "users_sequence";
		
	public String name;
	
	public String description;
	
	public String date;
	
	public Integer list_id;	
	
	private Integer quickId;
	
	
	@PersistenceConstructor
	public Items(String name, String description, String date, Integer list_id, Integer quickId) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
		this.list_id = list_id;
		this.quickId = quickId;
	}


	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", list_id="
				+ list_id + ", quickId=" + quickId + "]";
	}


	

}
