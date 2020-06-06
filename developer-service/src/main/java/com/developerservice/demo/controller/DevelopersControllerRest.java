package com.developerservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.developerservice.demo.entidad.Developer;
import com.developerservice.demo.modelo.DeveloperRepository;

@RestController
public class DevelopersControllerRest {

	@Autowired
	DeveloperRepository repository;
	
	@GetMapping("/developer/{id}")
	public Developer developer(@PathVariable Long id, Model model) {		
		Developer developer =  repository.findById(id).get();
		return developer;
	}
	
	@GetMapping(value="/developers")
	public List<Developer> developersList(Model model) {
		//model.addAttribute("developers", repository.findAll());
		List<Developer> developerList = (List<Developer>) repository.findAll();
		return developerList;
	}
	
}
