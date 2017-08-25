package com.everis.alicante.courses.beca.summer17.DAO;


import com.everis.alicante.courses.beca.summer17.entity.Person;

public interface PersonDao extends EntityDAO<Person, Long> {
	
	public Person relatePersons(Long id, Iterable<Long> ids);
	
	
}
