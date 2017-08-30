package com.everis.alicante.courses.beca.summer17.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.entity.Group;
import com.everis.alicante.courses.beca.summer17.manager.GroupManager;


@RestController
@RequestMapping("/group")

public class GroupController{
	
	@Autowired
	GroupManager groupManager;

	//Devolver todo de una persona
	
	@GetMapping
	public List<Group> findAll() {
		return (List<Group>) groupManager.findAll();
	}
//Encontrar por ID
	@GetMapping("/{id}")
	public Group findById(@PathVariable Long id) {
		return groupManager.findById(id);
	}
//crear y o guardar un  grupo
	
	@PostMapping
	public Group save(@RequestBody Group group) {
		return groupManager.save(group);
	}
//Borrar un grupo
	public void remove(Group group) {

		groupManager.remove(group);
	}

}