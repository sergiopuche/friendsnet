package com.everis.alicante.courses.beca.summer17.manager;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.entity.FNEntity;

@Service
public interface Manager <E extends FNEntity, ID extends Serializable>{

	
	E findById (ID id);
	Iterable<E> findAll();
	E update (E e);
	Iterable<E> update (Iterable<E> es);
	void remove (E e);
	Iterable<E> save (Iterable<E> es) ;
	E save (E e) ;
}

