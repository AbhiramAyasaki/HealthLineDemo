package com.example.healthLine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.healthLine.pojo.PersonDO;
import com.example.healthLine.service.healthService;

@RestController
public class HealthController {
	
	
	@Autowired
	private healthService healthService;
	
	@GetMapping("/persons")
	public ResponseEntity<List<PersonDO>> getAllProduct(){
		return ResponseEntity.ok().body(healthService.getAllpersons());
	}
	
	@GetMapping("/persons/{id}")
	public ResponseEntity<PersonDO> getProductById(@PathVariable long id){
		return ResponseEntity.ok().body(healthService.getProductById(id));
	}
	
	@PostMapping("/persons")
	public ResponseEntity<PersonDO> createProduct(@RequestBody PersonDO personDO){
		return ResponseEntity.ok().body(this.healthService.createPerson(personDO));
	}
	
	@PutMapping("/persons/{id}")
	public ResponseEntity<PersonDO> updateProduct(@PathVariable long id, @RequestBody PersonDO personDO){
		personDO.setId(id);
		return ResponseEntity.ok().body(this.healthService.updateProduct(personDO));
	}

	@DeleteMapping("/persons/{id}")
	public HttpStatus deleteProduct(@PathVariable long id){
		this.healthService.deletePersons(id);
		return HttpStatus.OK;
	}
	
	
	
	

}
