package com.developerservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.developerservice.demo.entidad.Developer;
import com.developerservice.demo.modelo.DeveloperRepository;

@RestController
public class DevelopersControllerRest {

	@Autowired
	DeveloperRepository repository;
	
	@GetMapping("/developer/{id}")
	public Developer developer(@PathVariable Long id) {		
		return repository.findById(id).get();		
	}
	
	@GetMapping(value="/developers")
	public List<Developer> developersList() {
		//model.addAttribute("developers", repository.findAll());
		return (List<Developer>) repository.findAll();		
	}
	
    @PostMapping(value="/save")
    public Developer developersAdd(@RequestBody Developer developer) {
    /*public String developersAdd(@RequestParam String email, 
                        @RequestParam String firstName, @RequestParam String lastName, Model model) {
        Developer newDeveloper = new Developer();
        newDeveloper.setEmail(email);
        newDeveloper.setFirstName(firstName);
        newDeveloper.setLastName(lastName);*/
        return repository.save(developer);
    }
}
