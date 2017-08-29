package com.everis.alicante.courses.beca.summer17.entity;

import java.sql.Date;

public class Post implements FNEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date creationDate;
	private Post typeOfPost;
	private byte[] picture;
	
	public Long getId() {
		return id;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
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
	public Post getTypeOfPost() {
		return typeOfPost;
	}
	public void setTypeOfPost(Post typeOfPost) {
		this.typeOfPost = typeOfPost;
	}
	
	
}
