package com.game.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.game.start.model.Libro;
import com.game.start.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public ResponseEntity<Object> listBooks(){
		List<Libro> libros = service.listAll();
		//System.out.print(libros.get(0).);
		return new ResponseEntity<>(libros, HttpStatus.ACCEPTED);
	}
}
