package com.game.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.game.start.model.Libro;
import com.game.start.respository.BookRepository;

@Service
@Transactional
public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	public List<Libro> listAll(){
		return repository.findAll();
	}
	
}
