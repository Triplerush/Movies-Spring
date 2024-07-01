package com.practice.movies.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/movies")
public class MoviesController {
	
	//private final ContactsService contactService;
	
	@GetMapping
	public String listContact(Pageable pag){
		return ResponseEntity.ok("Hola").getBody();
	}
	
}
