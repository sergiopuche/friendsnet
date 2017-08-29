package com.everis.alicante.courses.beca.summer17.DAO;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.entity.FNEntity;

public interface EntityDAO<E extends FNEntity, ID extends Serializable> {

	E findById (ID id);
	Iterable<E> findAll();
	E update (E e);
	Iterable<E> update (Iterable<E> es);
	void remove (E e);
	Iterable<E> save (Iterable<E> es) ;
	E save (E e);
	
	
}
