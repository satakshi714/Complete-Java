package com.capg.movie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cato")
public class CategoryController {

	@RequestMapping("/list")
	public Movie getAllData() {
		return new Movie(1001, "RRR");
	};
}
