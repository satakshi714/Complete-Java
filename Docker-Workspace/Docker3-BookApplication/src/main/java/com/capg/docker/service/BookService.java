package com.capg.docker.service;

import org.springframework.stereotype.Service;

import com.capg.docker.entity.Book;


@Service
public class BookService {

	public Book getBook() {
		return new Book(101, "Spring Boot Guide");
	}
}