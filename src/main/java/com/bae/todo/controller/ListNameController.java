package com.bae.todo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;
import com.bae.todo.service.ItemService;
import com.bae.todo.service.ListNameService;

@CrossOrigin
@RestController
public class ListNameController {
	
	

	private ListNameService service;

	public ListNameController(ListNameService service) {
		super();
		this.service = service;
	} 
	
	@PostMapping("/createList")
	public ResponseEntity<ListName> createList(@RequestBody ListName listname) {
		ListName responseBody = this.service.createListName(listname);
		ResponseEntity<ListName> response = new ResponseEntity<ListName>(responseBody, HttpStatus.CREATED);
		return response;
	}
	
	
//	@GetMapping("/getItemsById/{id}")
//	public Items getById(@PathVariable Integer id) {
//		return this.service.getItemsById(id); // why is this not working?
//		
//	}
	
	@GetMapping("/getListByName/{listName}")
	public ListName getListNameByName(@PathVariable String listname) {
		return this.service.getListNameByName(listname);
	}
	
	@GetMapping("/getListById/{id}")
	public ListName getListById(@PathVariable Integer id) {
		return this.service.getListNameById(id);
	}
	
	
	@GetMapping("/getAllLists")
	public List<ListName> getAllItems() {
		return this.service.getAllLists();
	}
	
	@PutMapping("updateList/{id}")
	public ResponseEntity<ListName> updateItems(@RequestBody ListName listName, @PathVariable Integer id) {
		ListName responseBody = this.service.updateListName(listName, id);
		ResponseEntity<ListName> response = new ResponseEntity<ListName>(responseBody, HttpStatus.ACCEPTED);
		return response;
	}
	
	@DeleteMapping("deleteList/{id}")
	public ResponseEntity<ListName> deleteListName(@PathVariable Integer id) {
		boolean deleted = this.service.deleteListName(id, null);
		if(deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}