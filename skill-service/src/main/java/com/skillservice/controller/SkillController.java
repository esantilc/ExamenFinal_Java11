package com.skillservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillservice.dao.SkillRepository;

@RestController
public class SkillController  {

	@Autowired
	SkillRepository skillRepository;
	
	@GetMapping("/skills")
	public String skillsList(Model model) {
		model.addAttribute("developers", skillRepository.findAll());
		return "developers";
	}
	
	@GetMapping("/skill/{id}")
	public String skill(@PathVariable Long id, Model model) {
		model.addAttribute("developer", skillRepository.findById(id).get());
		return "developer";
	}
	
}