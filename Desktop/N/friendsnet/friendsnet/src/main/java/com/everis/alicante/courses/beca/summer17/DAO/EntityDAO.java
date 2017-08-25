package com.everis.alicante.courses.beca.summer17.DAO;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.entity.FNEntity;

public interface EntityDAO<E extends FNEntity, ID extends Serializable> {

	E findById (ID id);
	Iterable<E> findAll();
	void update (E e);
	void update (Iterable<E> es);
	void remove (E e);
	void save (Iterable<E> es) ;
	void save (E e);
	
	
}
