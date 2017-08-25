package com.everis.alicante.courses.beca.summer17.controller;

import java.util.List;

import org.yaml.snakeyaml.events.Event.ID;

import com.everis.alicante.courses.beca.summer17.entity.Person;
import com.everis.alicante.courses.beca.summer17.manager.PersonManager;

public class PersonController {

	PersonManager personManager;

	public List<Person> findAll() {

		return (List<Person>) personManager.findAll();

	}	

	public Person findById(ID id) {
		

		return Person personManager.findById(id);

		
	}
	
	
	public Person save(Person);{
		
		
		
	}

}
