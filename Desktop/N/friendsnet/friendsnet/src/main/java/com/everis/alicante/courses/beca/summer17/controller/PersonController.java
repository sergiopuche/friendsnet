package com.everis.alicante.courses.beca.summer17.controller;

import java.util.List;


import com.everis.alicante.courses.beca.summer17.entity.Person;
import com.everis.alicante.courses.beca.summer17.manager.PersonManager;

public class PersonController {

	PersonManager personManager;

	public List<Person> findAll() {

		return (List<Person>) personManager.findAll();

	}	

	public Person findById(Long id) {
		return personManager.findById(id);
	}
	
	
	public Person save(Person person) {
		return personManager.save(person);
	}	
		
		
	
	public void remove(Person person) {
		
		personManager.remove(person);
		
	}
	

}
