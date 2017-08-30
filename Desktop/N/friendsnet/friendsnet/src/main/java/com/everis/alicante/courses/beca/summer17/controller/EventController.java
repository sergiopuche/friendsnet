package com.everis.alicante.courses.beca.summer17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.entity.Event;
import com.everis.alicante.courses.beca.summer17.manager.EventManager;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	EventManager eventManager;

	@GetMapping("/{id}")
	public Event findById(@PathVariable Long id) {

		return eventManager.findById(id);
	}

	@GetMapping
	public Iterable<Event> findAll() {

		return eventManager.findAll();
	}

	@PutMapping
	public Event update(Event e) {

		return eventManager.update(e);
	}

	@PutMapping("/all")
	public Iterable<Event> update(Iterable<Event> es) {

		return eventManager.update(es);
	}

	public void remove(Event e) {
		eventManager.remove(e);

	}

	@PostMapping
	public Iterable<Event> save(@RequestBody Iterable<Event> es) {

		return eventManager.save(es);
	}

	@PostMapping("/all")
	public Event save(@RequestBody Event e) {
		return eventManager.save(e);
	}
}
