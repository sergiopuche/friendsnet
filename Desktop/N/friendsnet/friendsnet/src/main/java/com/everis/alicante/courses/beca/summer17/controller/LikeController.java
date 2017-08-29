package com.everis.alicante.courses.beca.summer17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.entity.Post;


@RestController
@RequestMapping("/like")

public class LikeController {

@Autowired
	LikeController likeController;


public Post findById(Long id) {
	
	return likeController.findById(id);
}


public Iterable<Post> findAll() {

	return likeController.findAll();
}


public Post update(Post e) {

	return likeController.update(e);
}

public Iterable<Post> update(Iterable<Post> es) {
	return likeController.update(es);
	
}

public void remove(Post e) {
	
likeController.remove(e);
	
}

public Iterable<Post> save(Iterable<Post> es) {
	
	return likeController.save(es);
}

public Post save(Post e) {

	return likeController.save(e);
}

}

