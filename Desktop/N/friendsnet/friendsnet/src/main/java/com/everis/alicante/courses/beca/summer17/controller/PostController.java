package com.everis.alicante.courses.beca.summer17.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.entity.Post;
import com.everis.alicante.courses.beca.summer17.manager.PostManager;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostManager postManager;
	

	public Post findById(Long id) {
		
		return postManager.findById(id);
	}

	
	public Iterable<Post> findAll() {

		return postManager.findAll();
	}


	public Post update(Post e) {

		return postManager.update(e);
	}
	
	public Iterable<Post> update(Iterable<Post> es) {
		return postManager.update(es);
		
	}
	
	public void remove(Post e) {
		
	postManager.remove(e);
		
	}

	public Iterable<Post> save(Iterable<Post> es) {
		
		return postManager.save(es);
	}

	public Post save(Post e) {

		return postManager.save(e);
	}


}
