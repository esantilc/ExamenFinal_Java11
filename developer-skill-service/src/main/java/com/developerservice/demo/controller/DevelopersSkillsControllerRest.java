package com.developerservice.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.developerservice.demo.entidad.DeveloperSkill;
import com.developerservice.demo.modelo.DeveloperSkillRepository;

@RestController
public class DevelopersSkillsControllerRest {

	@Autowired
	DeveloperSkillRepository repository;
	
	@GetMapping("/developer/{id}/skill")
	public Optional<DeveloperSkill> developer(@PathVariable Long id, Model model) {		
		Optional<DeveloperSkill> developer =  repository.findById(id);
		return developer;
	}
	
	@GetMapping(value="/developersskill")
	public List<DeveloperSkill> developersList(Model model) {
		//model.addAttribute("developers", repository.findAll());
		List<DeveloperSkill> developerList = (List<DeveloperSkill>) repository.findAll();
		return developerList;
	}
	


	
}
