package com.everis.alicante.courses.beca.summer17.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.entity.Person;
import com.everis.alicante.courses.beca.summer17.manager.PersonManager;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonManager personManager;

	@GetMapping
	public List<Person> findAll() {
		return (List<Person>) personManager.findAll();
	}	

	@GetMapping("/{id}")
	public Person findById(@PathVariable Long id) {
		return personManager.findById(id);
	}
	
	@PostMapping
	public Person save(@RequestBody Person person) {
		return personManager.save(person);
	}	
		
		
	
	public void remove(Person person) {
		
		personManager.remove(person);
		
	}
	

}
