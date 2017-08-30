package com.everis.alicante.courses.beca.summer17.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.entity.Post;
import com.everis.alicante.courses.beca.summer17.manager.PostManager;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostManager postManager;
	
	@GetMapping("/all")
	public Post findById(@PathVariable Long id) {
		
		return postManager.findById(id);
	}

	@GetMapping
	public Iterable<Post> findAll() {

		return postManager.findAll();
	}

	@PutMapping("/all")
	public Post update(Post e) {

		return postManager.update(e);
	}
	@PutMapping
	public Iterable<Post> update(Iterable<Post> es) {
		return postManager.update(es);
		
	}
	
	public void remove(Post e) {
		
	postManager.remove(e);
		
	}
@PostMapping
	public Iterable<Post> save(@RequestBody Iterable<Post> es) {
		
		return postManager.save(es);
	}
@PostMapping("/all")
	public Post save(@RequestBody Post e) {

		return postManager.save(e);
	}


}
