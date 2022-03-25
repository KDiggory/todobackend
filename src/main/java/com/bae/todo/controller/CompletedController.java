package com.bae.todo.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bae.todo.entity.Completed;
import com.bae.todo.service.CompletedService;

@CrossOrigin
@RestController
public class CompletedController {
	
	private CompletedService service;
	
	@Autowired
	public CompletedController(CompletedService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(value = "/addToComplete" , consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Completed createCompleted(@RequestBody Completed completed) {
		return service.createCompleted(completed);
	}
	
//	@DeleteMapping("/removeFromComplete/{id}")
//	public ResponseEntity<Completed> deleteItems(@PathVariable Integer id) {
//		boolean deleted = this.service.deleteItems(id, null);
//		if(deleted) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} else {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//	
	@GetMapping("/getAllCompleted")
	public List<Completed> getAllCompleted() {
		return this.service.getAllComplete(); 
	}
	
	
	

}
