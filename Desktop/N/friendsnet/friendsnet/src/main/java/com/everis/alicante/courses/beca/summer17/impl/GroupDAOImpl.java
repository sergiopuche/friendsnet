package com.everis.alicante.courses.beca.summer17.impl;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.DAO.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.DAO.GroupDAO;
import com.everis.alicante.courses.beca.summer17.entity.Group;

@Service

public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO{

}
