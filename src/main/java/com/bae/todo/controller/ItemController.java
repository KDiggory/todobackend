package com.bae.todo.controller;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.bae.todo.dto.ListNameDTO;
import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;
import com.bae.todo.service.ItemService;


@CrossOrigin
@RestController
public class ItemController {	
	
	private ItemService service;
	
	@Autowired
	public ItemController(ItemService service) {
		this.service = service;
	} 
	
	@PostMapping(value = "/createItems" , consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Items createItems(@RequestBody Items items) {
		return service.createItems(items);
		
	}
	
	
//	@GetMapping("/getItemsById/{id}")
//	public Items getById(@PathVariable Integer id) {
//		return this.service.getItemsById(id); // why is this not working?
//		
//	}
	

//	@GetMapping("/getByList/{id}") // this is throwing 500 internal server error, why???
//	public List<Items> getByList(@PathVariable Integer id) {
//		this.service.getByList(id).forEach(n -> System.out.println(n));
//		return this.service.getByList(id);
//	}
//	
	@GetMapping(value = "/getAll", produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Items> getAllItems() {
		return this.service.getAllItems(); // this returns emoty items to postman
	}
	
//	@PutMapping("updateItems/{id}")
//	public ResponseEntity<Items> updateItems(@RequestBody Items item, @PathVariable Integer id) {
//		Items responseBody = this.service.updateItems(item, id);
//		ResponseEntity<Items> response = new ResponseEntity<Items>(responseBody, HttpStatus.ACCEPTED);
//		return response;
//	}
	
//	@DeleteMapping(value= "/deleteItems/{id}", consumes = APPLICATION_JSON_VALUE)
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void deleteItems(@PathVariable ObjectId id) {
//		this.service.deleteItems(id);
//	}

}