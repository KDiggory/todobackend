package com.bae.todo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Completed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	
	private String description;
	
	private String date;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private ListName list_id;

	public Completed(Integer id, String name, String description, String date, ListName list_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.list_id = list_id;
	}

	public Completed() {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ListName getList_id() {
		return list_id;
	}

	public void setList_id(ListName list_id) {
		this.list_id = list_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, description, id, list_id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Completed other = (Completed) obj;
		return Objects.equals(date, other.date) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(list_id, other.list_id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Completed [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date
				+ ", list_id=" + list_id + "]";
	}	
	
	

}
