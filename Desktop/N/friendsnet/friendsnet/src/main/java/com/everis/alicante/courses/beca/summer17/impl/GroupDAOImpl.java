package com.everis.alicante.courses.beca.summer17.impl;



import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.DAO.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.DAO.GroupDAO;
import com.everis.alicante.courses.beca.summer17.entity.Group;
import com.everis.alicante.courses.beca.summer17.entity.Person;


@Service
public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO{

	public Person relatePersons(Long id, Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
