package com.skillservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillservice.dao.SkillRepository;
import com.skillservice.model.Skill;

@RestController
public class SkillController  {

	@Autowired
	SkillRepository skillRepository;
	
	@GetMapping("/skills")
	public List<Skill> skillsList() {
		return skillRepository.findAll();
	}
	
	@GetMapping("/skills/{id}")
	public Skill skill(@PathVariable Long id) {
		return skillRepository.findById(id).get();
	}
}