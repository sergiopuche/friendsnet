package com.everis.alicante.courses.beca.summer17.impl;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.DAO.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.DAO.PersonDao;
import com.everis.alicante.courses.beca.summer17.entity.Person;

@Service
public class PersonDAOImpl extends AbstractDAO<Person, Long> implements PersonDao{

	@Override
	public Person relatePersons(Long id, Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}


}
