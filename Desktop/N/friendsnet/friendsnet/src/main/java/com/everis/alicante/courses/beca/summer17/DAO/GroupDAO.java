package com.everis.alicante.courses.beca.summer17.DAO;


import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.entity.Group;
import com.everis.alicante.courses.beca.summer17.entity.Person;


@Service
public interface GroupDAO extends EntityDAO<Group, Long>{

	
	public Person relatePersons(Long id, Iterable<Long> ids);
	
}
