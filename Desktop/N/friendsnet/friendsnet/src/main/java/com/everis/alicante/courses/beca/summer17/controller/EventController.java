package com.everis.alicante.courses.beca.summer17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.DAO.EventDAO;
import com.everis.alicante.courses.beca.summer17.entity.Event;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
		EventDAO eventDAO;
	
		public Event findById(Long id) {
				
			return eventDAO.findById(id);
		}

		
		public Iterable<Event> findAll() {
			
			return eventDAO.findAll();
		}

		
		public Event update(Event e) {
			
			return eventDAO.update(e);
		}

		
		public Iterable<Event> update(Iterable<Event> es) {
			
			return eventDAO.update(es);
		}

		public void remove(Event e) {
			eventDAO.remove(e);
			
		}

		
		public Iterable<Event> save(Iterable<Event> es) {

			return eventDAO.save(es);
		}

	
		public Event save(Event e) {
			return eventDAO.save(e);
		}
	}
	
	
