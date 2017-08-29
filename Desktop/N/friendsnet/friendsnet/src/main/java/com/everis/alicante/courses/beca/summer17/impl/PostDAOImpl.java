package com.everis.alicante.courses.beca.summer17.impl;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.DAO.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.DAO.PostDAO;

import com.everis.alicante.courses.beca.summer17.entity.Post;



@Service
public class PostDAOImpl extends AbstractDAO<Post, Long> implements PostDAO{

}
