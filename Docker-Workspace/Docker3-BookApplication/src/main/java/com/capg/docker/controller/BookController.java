package com.capg.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.docker.entity.Book;
import com.capg.docker.service.BookService;



@RestController
public class BookController {

	@Autowired
	BookService service;

	@GetMapping("/book")
	public Book getBookData() {
		return service.getBook();
	}
}