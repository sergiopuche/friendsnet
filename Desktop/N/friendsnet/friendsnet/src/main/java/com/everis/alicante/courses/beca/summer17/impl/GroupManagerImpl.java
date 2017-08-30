package com.everis.alicante.courses.beca.summer17.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.DAO.GroupDAO;
import com.everis.alicante.courses.beca.summer17.entity.Group;
import com.everis.alicante.courses.beca.summer17.manager.GroupManager;

@Service
	public class GroupManagerImpl implements GroupManager{
		
	@Autowired
		private GroupDAO groupDao;
		
	@Override
		public Group findById(Long id) {
			return groupDao.findById(id);
			
		}
	
	@Override
		public Iterable<Group> findAll() {
			
			return groupDao.findAll();
		}
	
	@Override
		public Group update(Group e) {
			
			return groupDao.update(e);
		}
	
	@Override
		public Iterable<Group> update(Iterable<Group> es) {
			return groupDao.update(es);
		}
	
	@Override
		public void remove(Group e) {
			
			groupDao.remove(e);
		}
	
	@Override
		public Iterable<Group> save(Iterable<Group> es) {
	
	
			return groupDao.save(es);
		}
	
	@Override
		public Group save(Group e) {
			return groupDao.save(e);
		}
	
		
		
		
	}
