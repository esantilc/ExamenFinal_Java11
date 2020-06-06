package com.developerservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.developerservice.demo.entidad.Developer;
import com.developerservice.demo.modelo.DeveloperRepository;

@RestController
public class DevelopersController {

	@Autowired
	DeveloperRepository repository;
	
	@GetMapping("/developer/{id}")
	public Developer developer(@PathVariable Long id, Model model) {	
		return repository.findById(id).get();
	}
	
	@GetMapping("/developers")
	public List<Developer> developersList(Model model) {
		return (List<Developer>)repository.findAll();
	}
	
	@PostMapping("/developers")
	public Long developersAdd(@RequestParam String email, 
						@RequestParam String firstName, @RequestParam String lastName) {
		Developer newDeveloper = new Developer();
		newDeveloper.setEmail(email);
		newDeveloper.setFirstName(firstName);
		newDeveloper.setLastName(lastName);
		repository.save(newDeveloper);

		return newDeveloper.getId();
	}
	
}
