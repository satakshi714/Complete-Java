package com.capg.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.docker.entity.Movie;

@RestController
@RequestMapping("/cato")
public class MovieController {
	@RequestMapping("/list")
	public Movie getAllData() {
		return new Movie(1001,"RRR");
	}
}
