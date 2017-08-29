package com.everis.alicante.courses.beca.summer17.entity;

import java.sql.Date;

public class Like implements FNEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private Date creationDate;
	private Like typeOfLike;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Like getTypeOfLike() {
		return typeOfLike;
	}
	public void setTypeOfLike(Like typeOfLike) {
		this.typeOfLike = typeOfLike;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
