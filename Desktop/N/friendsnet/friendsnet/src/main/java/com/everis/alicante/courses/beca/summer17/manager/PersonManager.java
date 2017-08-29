package com.everis.alicante.courses.beca.summer17.manager;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.entity.Person;
@Service

public interface PersonManager extends Manager<Person, Long> {
	
	
	public Person relatePersons (Iterable<Person> persons);
	
	

}
