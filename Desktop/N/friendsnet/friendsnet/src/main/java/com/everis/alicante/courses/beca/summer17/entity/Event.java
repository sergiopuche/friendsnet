package com.everis.alicante.courses.beca.summer17.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Event implements FNEntity {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@Id	
	
	private Long id;
	private Date creationDatePost;
	private Date endingDatePost;
	private Date Time;
	
	public Long getId(){
		
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreationDatePost() {
		return creationDatePost;
	}
	public void setCreationDatePost(Date creationDatePost) {
		this.creationDatePost = creationDatePost;
	}
	public Date getEndingDatePost() {
		return endingDatePost;
	}
	public void setEndingDatePost(Date endingDatePost) {
		this.endingDatePost = endingDatePost;
	}
	public Date getTime() {
		return Time;
	}
	public void setTime(Date time) {
		Time = time;
	}
	
}
