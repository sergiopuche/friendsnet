package com.everis.alicante.courses.beca.summer17.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.DAO.PersonDao;
import com.everis.alicante.courses.beca.summer17.entity.Person;
import com.everis.alicante.courses.beca.summer17.manager.PersonManager;

@Service
public class PersonManagerIMPL implements PersonManager{
	
	@Autowired
	PersonDao personDao;

	@Override
	public Person findById(Long id) {

		return personDao.findById(id);
	}

	@Override
	public Iterable<Person> findAll() {
		return personDao.findAll();
	}

	@Override
	public Person update(Person e) {
		
		return personDao.update(e);
		
	}

	@Override
	public Iterable<Person>  update(Iterable<Person> es) {
		
		
		return personDao.update(es);
	}

	@Override
	public void remove(Person e) {
		personDao.remove(e);
		
	}

	@Override
	public Iterable<Person> save(Iterable<Person> es) {
		
		return personDao.save(es);
	}

	@Override
	public Person save(Person e) {
		
		return personDao.save(e);
	}

}
