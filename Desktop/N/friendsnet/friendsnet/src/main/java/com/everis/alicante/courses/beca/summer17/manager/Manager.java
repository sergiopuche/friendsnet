package com.everis.alicante.courses.beca.summer17.manager;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.entity.FNEntity;

public interface Manager <E extends FNEntity, ID extends Serializable>{

	
	E findById (ID id);
	Iterable<E> findAll();
	void update (E e);
	void update (Iterable<E> es);
	void remove (E e);
	E save (Iterable<E> es) ;
	E save (E e) ;
}

