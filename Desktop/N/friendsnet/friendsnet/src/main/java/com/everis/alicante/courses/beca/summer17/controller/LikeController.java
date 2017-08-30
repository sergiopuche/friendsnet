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


@RestController
@RequestMapping("/like")

public class LikeController {

@Autowired
	LikeController likeController;

@GetMapping("/all")
public Post findById(@PathVariable Long id) {
	
	return likeController.findById(id);
}

@GetMapping
public Iterable<Post> findAll() {

	return likeController.findAll();
}
@PutMapping("/all")

public Post update(Post e) {

	return likeController.update(e);
}
@PutMapping
public Iterable<Post> update(Iterable<Post> es) {
	return likeController.update(es);
	
}

public void remove(Post e) {
	
likeController.remove(e);
	
}
@PostMapping("/all")
public Iterable<Post> save(@RequestBody Iterable<Post> es) {
	
	return likeController.save(es);
}
@PostMapping
public Post save(@RequestBody Post e) {

	return likeController.save(e);
}

}

